package Wyjatki;

import java.io.*;
import java.util.Arrays;

public class ZapisPliku {


    public static void main(String[] args) {

        int[] liczby = new int[] {1, 3, 4, 12};

    String motto = "Globalny kryzys";
      try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("pierwszyPlik.txt"));
        writer.write("Widzisz mnie \n");
        writer.write(motto);
        writer.newLine();
        writer.write("Programista java \n");

        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
            writer.write(liczby[i] + System.lineSeparator());
        }
        writer.write(liczby.length + System.lineSeparator());
        writer.write("xd");
        writer.close();

      }
      catch (IndexOutOfBoundsException e ) {
          System.out.println("Bląd ");
          System.out.println(e.fillInStackTrace());

      }
      catch (IOException e ){
          System.out.println(e.getMessage());
          ;
      }
    }
}
