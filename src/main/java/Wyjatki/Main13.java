package Wyjatki;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.Format;

class Main13 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        int readNumber = reader.read();
        int i = 0;
        while (readNumber!= -1) {
            char uncrypt = (char)readNumber;
            System.out.print(uncrypt);
            readNumber = reader.read();
            i++;

        }
        reader.close();
        System.out.println(i);




    }
}