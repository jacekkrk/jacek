package Wyjatki;

import javax.xml.transform.sax.SAXSource;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main15 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int streem = reader.read();
        int i = 1;
        char zlap = ' ';
        int zlapInt = (int) zlap;
        while (streem == zlapInt) {
            streem = reader.read();
        }
        reader.readLine().trim();
        while (streem != -1) {
            if (streem == zlapInt) {
                i++;
                while (streem == zlapInt) {
                    streem = reader.read();
                }
            }
            streem = reader.read();
        }
        if (i == 1) {
            System.out.println(0);
        } else {
            System.out.println(i);
        }
        reader.close();
    }
}
