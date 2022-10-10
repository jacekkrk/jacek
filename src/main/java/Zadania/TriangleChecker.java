package Zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleChecker {
    public static void main(String[] args) throws IOException {

        int a , b , c;
        double ans;

        try {
            BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Podaj dlugosc boku a : ");
            a = Integer.parseInt(read.readLine());
            if (a < 0 ) {
                System.out.println("podaj liczbe wieksza od 0");
                a = Integer.parseInt(read.readLine());
            }
            System.out.println("Podaj dlugosc boku b : ");
            b = Integer.parseInt(read.readLine());
            if (b < 0 ) {
                System.out.println("podaj liczbe wieksza od 0");
                b = Integer.parseInt(read.readLine());
            }
            System.out.println("Podaj dlugosc boku c : ");
            c = Integer.parseInt(read.readLine());
            if (c < 0 ) {
                System.out.println("podaj liczbe wieksza od 0");
                c = Integer.parseInt(read.readLine());
            }
            ans = (Math.pow(a,2) + Math.pow(b,2));
            if (ans == c*c ) {
                System.out.println("Trojkat jest prostokatny");
            }
            else {
                System.out.println("Trojkat nie jest prostokatny ");
            }

        } catch (Exception e) {
            System.out.println("Zly typ danych czy to blad 404 ?");
        }


    }
}
