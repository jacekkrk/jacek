package Wyjatki;

import java.io.InputStream;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

class Main14 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        byte[] printMe = inputStream.readAllBytes();
        int i= 0;
        while (i < printMe.length-1) {
            System.out.print(printMe[i]);
            i++;
            ;
        }

     /*   int i =0;
        ArrayList<Integer> cathed = new ArrayList<Integer>();
        int zmienna = inputStream.read();
        while (zmienna!= -1) {
                cathed.add(zmienna);

*/

       //
    }
}