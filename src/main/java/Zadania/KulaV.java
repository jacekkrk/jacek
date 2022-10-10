package Zadania;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class KulaV {

    public static void main(String[] args) throws Exception{

        double r,v, pii;
        double a = 4.0/3.0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj promień szklanej kuli ? ");
        r = Double.parseDouble(br.readLine());
        pii = Math.PI;
        v = ( pii * r * r * r)*a;
        System.out.println(a);
        System.out.printf("objetosc = " + "%4.2f\n", v);



        int myOne = 37;
        int myTwo = 11;
        int myRes = myOne%myTwo;
        System.out.println(myRes);

    }
}
