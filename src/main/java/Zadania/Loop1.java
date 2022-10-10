package Zadania;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Loop1 {
    public static void main(String[] args) {

   /*     for (int i = 1; i <= 20; i++) {

            System.out.print(i);
            if (i == 20) {
                System.out.print(".");
                break;
                }
            System.out.print(", ");
            if (i == 10) System.out.println();

        } */
        int k = 1;
        do {

            System.out.print(k);
            if(k < 20)  System.out.print(", ");
            k++;

        } while (k<=20);
        System.out.print(".");
    }

}
