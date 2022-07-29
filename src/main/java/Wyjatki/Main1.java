package Wyjatki;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();

        for (int i = startNum ; i <= endNum ; i++) {

            if ( startNum % 3 == 0 && startNum % 5 == 0) {
                System.out.println("FizzBuzz");

            }
            else if (startNum % 3 == 0  ) {
                System.out.println("Fizz");
            } else if (startNum % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(startNum);
            }

        }
    }
}