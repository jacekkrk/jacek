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
        char [] zapisz = new char[50];
        while (readNumber!= -1) {
            char uncrypt = (char)readNumber;
            zapisz[i] = uncrypt;
            i++;
            readNumber = reader.read();
        }
        i -=1;
        for (int k = i ; k <= i ; k-- ) {
            System.out.print(zapisz[k]);
            if( k == 0) {
                break;
            }
        }
        reader.close();
    }
}