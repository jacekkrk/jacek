package shipGame;

import com.sun.jdi.IntegerValue;

import java.util.Locale;
import java.util.Scanner;

public class Strzelaj {

    public static void main(String[] args) {
        Scanner czytaj = new Scanner(System.in);
        String a = czytaj.nextLine().toUpperCase();
        String[] nju = a.split(" ");
        Strzelaj ss = new Strzelaj();
        ss.strzelaj(nju);
        }

        public void strzelaj(String[] nju){

            int zz = translate(nju[0].substring(0,1));
            int za = Integer.valueOf(nju[0].substring(1, nju[0].length()))-1;
            System.out.println(zz);
            System.out.println(za);

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

