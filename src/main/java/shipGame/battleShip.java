package shipGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.*;

public class battleShip {
    public static void main(String[] args) {

        int nShip = 1;
        int battleFiledSize = 10;
        char water = '`';
        char ship = 'o';
        char miss = 'm';
        char shot = 'x';

        char[][] gameBoard = creatGame(battleFiledSize, water, nShip, ship);
        out.println(gameBoard[0][0]);


    }

    private static char[][] creatGame(int battleFiledSize, char water, int nShip, char ship) {
        char[][] gameBoard = new char[battleFiledSize][battleFiledSize];
        for (char[] row : gameBoard) {
            Arrays.fill(row, water);
        }
        return placeShip(gameBoard, water, ship, nShip);
    }

    private static char[][] placeShip(char[][] gameBoard, char water, char ship, int nShip) {


        int shipAdd = 0;


        while (shipAdd < nShip){
            int [] getCordinate = userGet();


                if(getCordinate[0] == getCordinate[2])
                    //ship horizontal
                    for (int i = 0; i <= (getCordinate[3] - getCordinate[1]); i++) {
                        gameBoard[0][getCordinate[i+ getCordinate[1]]] = ship;
                        out.println("bum");
            }



            shipAdd++;
        }
        return gameBoard;
       }

    private static int[] userGet() {
        BufferedReader kr = new BufferedReader(new InputStreamReader(System.in));
        int[] cordinate = new int [4];
    try {
        int next = kr.read();
        int i = 0;
        while (next != -1  & i < cordinate.length ) {
            if(next == 32) {
                next = kr.read();
                continue;
            }
            if(i == 0 | i == 2) {
                cordinate[i] = next - 65;
                out.println(cordinate[i]);
            }
            if(i == 1 | i ==3) {
                cordinate[i] = next - 49;
                out.println(cordinate[i]);
            }
            next = kr.read();

            //out.println(i);
            i++;
        }

    }
    catch (Exception e) {
        out.println(e.getMessage());
    }

    return cordinate;
    }

}





