package shipGame;

import java.util.Scanner;

public class scanerTest {
int coords, startRow, startColumn;
    Scanner scanner;
    public static void main(String[] args) {
    }



    int translate(String coord) {
        switch (coord) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            case "G":
                return 6;
            case "H":
                return 7;
            case "I":
                return 8;
            case "J":
                return 9;
        }
        return -1;
    }

}


