package Zadania;

import java.sql.SQLOutput;
import java.util.Random;

/*Napisz program, który za pomocą instrukcji for znajduje największą i najmniejszą
  liczbę ze zbioru n wylosowanych liczb całkowitych od 0 do 99 (w zadaniu n = 5)
  oraz oblicza średnią ze wszystkich wylosowanych liczb. */
public class FoundMinimum {


    public static void main(String[] args) {


        Random getNumber = new Random();
        int rNum;
        int max = 0;
        int min = 99;
        double avg = 0;
        int cycle = 20;
        System.out.println("We lose five numbers 0 beetwen 99 ");
        for(int i = 0 ; i < cycle ; i++){
            rNum = getNumber.nextInt(99);
            if (rNum > max) {
                max = rNum;
            }
            if (rNum < min) {
                min = rNum;
            }
            System.out.print(rNum + " ");
            avg += rNum;
        }

        System.out.println();
        System.out.println("Minimum number = " + min + "\n" + "Maximum number = " + max);
        System.out.println("Avg = " + avg/cycle);
    }

}
