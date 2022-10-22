package myJavaStart.statyczne;

import java.util.Scanner;


public class PrintNumbers {

    private static final int exit = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("Podaj piewsza liczbe");
            int start = sc.nextInt();
            System.out.println("Podaj druga liczbe");
            int end = sc.nextInt();
            PrintNumbers.printNumber(start, end);

            System.out.println("Koniec programu wprowadz " + exit);
        }while (sc.nextInt() != exit);
        sc.close();



    }
    private static void printNumber(int start, int end){

        for (int i = start; i <= end; i ++){
            System.out.print(i + " " );
        }
        System.out.println();
    }
}
