package Wyjatki;

import java.util.*;

public class Main5 {

    public static double sqrt(double x) {

       if (x > 0) {
           return Math.sqrt(x);
       }
       throw new IllegalArgumentException("Expected non-negative number, got " + x) ;


    }

    /* Do not change code below */
    public static void main(String[] args) {
        String value = new Scanner(System.in).nextLine();
        try {
            double res = sqrt(Double.parseDouble(value));
            System.out.println(res);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
