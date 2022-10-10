package Zadania;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class PowPI {
    public static void main(String[] args) throws Exception {
      //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final  double PI =Math.PI;
     //   System.out.println("Podaj do jakiej potegi podnies PI");
      //  int pow = Integer.parseInt(br.readLine());
        double powResult =  Math.sqrt(PI);

        System.out.printf("%6.2f", powResult);

    }
}
