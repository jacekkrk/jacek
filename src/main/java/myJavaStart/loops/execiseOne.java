package myJavaStart.loops;

import java.util.Scanner;

public class execiseOne {

    public static void main(String[] args) {
        Scanner insertNumber = new Scanner(System.in);
        int result = 0;


        System.out.println("Podaj ilosc liczb do wprowadzeia");
        int amount = insertNumber.nextInt();

        do {
            System.out.println("Podaj liczbę");
            result += insertNumber.nextInt();
            amount--;
        } while (0 > amount);

        System.out.println(result);
    }

}
