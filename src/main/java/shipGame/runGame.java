package shipGame;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.B;
import static javax.print.attribute.standard.MediaSizeName.C;

public class runGame {



    public static void main(String[] args) {
        int battleSize = 10;
        String[] [] battleFiled = new String[battleSize] [battleSize];
        String[] menuLeft = new String[] {"A","B","C","D","E","F","G","H","I","J"};
        String[] menuUp = new String[] {"1","2","3","4","5","6","7","8","9","10"};
        Scanner addShip = new Scanner(System.in);



// Create field
        for(int i = 0; i < battleFiled.length; i++) {

           for(int k = 0; k < battleFiled.length; k++) {
               battleFiled[i][k] = "~";
           }
        }
    }
}

