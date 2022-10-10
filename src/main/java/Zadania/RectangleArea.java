package Zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RectangleArea {
    public static void main(String[] args) throws IOException {
     try {

         BufferedReader wr = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Podaj długość boku a : ");
         double sideA = Double.parseDouble(wr.readLine());
         System.out.println("Podaj długość boku b : ");
         double sideB = Double.parseDouble(wr.readLine());
         double result = sideA * sideB;

         System.out.println("Pole to = : " + result);
     }
     catch (NumberFormatException e ) {
         System.out.println("Nieporawny typ danych blad 404.");
     }
    }

}
