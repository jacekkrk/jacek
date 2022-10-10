package Zadania;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) throws IOException {
        BufferedReader inserNumber = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(inserNumber.readLine());

        Random liczba = new Random();

        double LosujLiczbę = Math.round(10*liczba.nextDouble());
        System.out.println((int)LosujLiczbę);
        System.out.print("Are you WINNER = ");
        System.out.println(((int)LosujLiczbę == a)) ;
    }
}
