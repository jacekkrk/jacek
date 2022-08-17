package shipGame;

import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;


public class runGame {
    int battleSize = 10;
    String[][] battleFiled = new String[battleSize][battleSize];
    String[] menuLeft = new String[]{"A ", "B ", "C ", "D ", "E ", "F ", "G ", "H ", "I ", "J "};
    String[] menuUp = new String[]{"1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10 "};
    Scanner addShip = new Scanner(System.in);
    int[] getedStartPiont = new int[2];
    int[] getedEndedPiont = new int[2];


    public static void main(String[] args) {
        runGame playGame = new runGame();
        playGame.creatField();
        playGame.showField();
        playGame.gameRules();

        //    playGame.addShip();


    }

    private void gameRules() {
        String[] ship = new String[]{"Aircraft Carrier", "Battleship", "Submarine", "Cruiser", "Cruiser"};
        int[] cells = new int[]{5, 4, 3, 2, 2};
        int i = 0 ;
        while (i < 5) {
            System.out.printf("Enter the coordinates of the %s (%s cells) \n", ship[i], cells[i]);
            if(this.addShip(cells[i])) {
            i++;
        }
            else {
                showField();
            }
        }


    }


    // Create field
    void creatField() {
        for (int i = 0; i < battleFiled.length; i++) {

            for (int k = 0; k < battleFiled.length; k++) {
                battleFiled[i][k] = "~ ";
            }
        }
    }

    void creatField(int x1, int x2, int y1, int y2) {
        if (x1 == x2) {
            for (int k = y1; k <= y2; k++) {
                battleFiled[x1][k] = "o ";
            }
        }
        if (y1 == y2) {
            for (int k = x1; k <= x2; k++) {
                battleFiled[k][y1] = "o ";
            }
        }
        showField();
    }

    void showField() {
        System.out.print("  ");
        for (int z = 0; z < battleFiled.length; z++) {
            System.out.print(menuUp[z]);
        }
        System.out.println();
        for (int i = 0; i < battleFiled.length; i++) {
            System.out.print(menuLeft[i]);
            for (int k = 0; k < battleFiled.length; k++) {
                System.out.print(battleFiled[i][k]);
            }
            System.out.println();
        }
    }

    boolean addShip(int i) {
        Scanner ship = new Scanner(System.in);
        String cord = ship.nextLine().toUpperCase(Locale.ROOT);
        String[] wyciety = cord.split(" ");
        char cx1 = wyciety[0].charAt(0);
        int x1 = cx1 - 65;
        int y1 = wyciety[0].charAt(1) - 49;
        try {
            if (wyciety[0].charAt(2) == 48) {
                y1 = 9;
            }

        } catch (StringIndexOutOfBoundsException e) {

        }
        char cx2 = wyciety[1].charAt(0);
        int x2 = cx2 - 65;
        int y2 = wyciety[1].charAt(1) - 49;
        try {
            if (wyciety[1].charAt(2) == 48) {
                y2 = 9;
            }

        } catch (StringIndexOutOfBoundsException e) {

        }
        boolean isGood = check(x1, x2, y1, y2, i);
        if (isGood) {
            creatField(x1, x2, y1, y2);
            //     showField();
        }
        System.out.println(isGood);
        return isGood;

        //  System.out.printf("%d , %d , %d , %d ", x1,y1, x2, y2  );



    }



    boolean check (int x1, int x2 , int y1, int y2, int i){
        System.out.println(i);
        if ( x1 == x2 && y1 != y2 && y2 -y1 == i-1) {
           return true;

        }
        else if (y1 == y2 && x1 != x2 && x2 -x1 == i-1) {
            return true;
        }
        else
            return false;

    }

    void wrShip(int x1,int x2, int y1, int y2){


    }

    void setShipOnField(int[] startPoint, int[] endPoint) {

    }
}


