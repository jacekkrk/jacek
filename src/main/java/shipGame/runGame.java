package shipGame;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        playGame.addShip();

    }

    // Create field
    void creatField() {
        for (int i = 0; i < battleFiled.length; i++) {

            for (int k = 0; k < battleFiled.length; k++) {
                battleFiled[i][k] = "~ ";
            }
        }
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

    void addShip() {
        try (BufferedReader ship = new BufferedReader(new InputStreamReader(System.in))) {
            int readShipStartPoint = ship.read();
            while (readShipStartPoint != -1 & readShipStartPoint != 10) {
                for (int s = 0; s < getedStartPiont.length & readShipStartPoint != 10 ; s++) {
                    getedStartPiont[s] = readShipStartPoint;
                    readShipStartPoint = ship.read();
                }

                readShipStartPoint = ship.read();

                for (int s = 0; s < getedStartPiont.length & readShipStartPoint != 10; s++) {
                    getedEndedPiont[s] = readShipStartPoint;
                    readShipStartPoint = ship.read();

                }

            }
            asciToDecX(getedStartPiont[0], getedStartPiont[1]);
            System.out.println(getedStartPiont[0] + " " + getedStartPiont[1]);
            asciToDecY(getedEndedPiont[0], getedEndedPiont[1]);
            System.out.print(getedEndedPiont[0] + " " + getedEndedPiont[1]);
            setShipOnField(getedStartPiont, getedEndedPiont);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    void asciToDecX(int x , int y ) {
        getedStartPiont[0] = x - 65;
        getedStartPiont[1] = y - 48;
    }
    void asciToDecY(int x, int y) {

        getedEndedPiont[0] = x - 65;
        getedEndedPiont[1] = y - 48;
    }

    void setShipOnField (int[] startPoint, int[] endPoint) {

        if (true) {
            System.out.println("tu");
            for( int k = 0 ;k < (endPoint[1] - startPoint[1]); k++ ) {
                battleFiled[0][startPoint[1] + k] = "0 ";
                System.out.println(k);
            }
            showField();
        }

    }
}


