package Zadania;

import javax.sound.midi.Soundbank;

public class showABCD
{


    public static void main(String[] args) {

        char first = 'A';
        char last = 'Z';
        int start = (int)first;
        int ende = (int)last;


       do {
           System.out.print((char) start + " ");

           start++;
       }while (start < ende);

        System.out.println();
        start -= 1;


        do {
            System.out.print((char) start + " ");

            start--;
        }while (start  >= (int) first);
    }
}
