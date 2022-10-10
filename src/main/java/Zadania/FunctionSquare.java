package Zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class FunctionSquare {


    public static void main(String[] args) throws IOException {
        double a, b, c, delta, x1, x2;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Witaj na kanonie matemtyki  ax^2+bx+c");
            System.out.println("Podaj wartosc a");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj wartosc b");
            b = Double.parseDouble(br.readLine());
            System.out.println("Podaj wartosc c");
            c = Double.parseDouble(br.readLine());
            delta = b*b - 4*a*c;
            if (delta > 0) {
                x1 = (-b - Math.sqrt(delta)) / 2*a;
                x2 = (-b + Math.sqrt(delta)) / 2*a;

                System.out.printf("%3.0f" + " " , x1);
                System.out.printf("%3.0f" , x2);
            }
            else if (delta == 0 ) {
                x1 = -b / 2*a;
                System.out.printf("%3.0f" + " " , x1);
            }
            else {
                System.out.println("Brak miejsca zerowego");
            }
        } catch (Exception e) {
            System.out.println("BLAD404");
        }


    }
}