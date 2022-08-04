package shipGame;

import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.B;
import static javax.print.attribute.standard.MediaSizeName.C;

public class runGame {



    public static void main(String[] args) {
        int battleSize = 10;
        char[] [] battleFiled = new char[battleSize + 1] [battleSize + 1];
        char[] menuUp = new char[] {'A','B','C','D','E','F','G','H','I','J','K'};
        Scanner addShip = new Scanner(System.in);

// Create field
        for(int i = 0; i < battleFiled.length; i++) {
            battleFiled[i][0] = (char)i;
           //     battleFiled[i][0] = menuUp[i];
        //    ii = (char)ii;
   //         battleFiled[i][0] = (char)ii + '1';
            for(int k = 1; k < battleFiled.length; k++) {

                battleFiled[i][k] = '~';
                    }

            }
        }

    }

