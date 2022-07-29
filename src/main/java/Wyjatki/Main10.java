package Wyjatki;

import java.util.Scanner;

class Main10 {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);

        boolean condition = true;
        while (condition) {
            k++;
            condition = scanner.nextInt() != 0 ? true :  false ;

        }
        while (scanner.nextInt() != 0 ) {
        }
        System.out.println(k);
    }
}