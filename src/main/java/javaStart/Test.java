package javaStart;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        int S = scanner.nextInt();
        int H1 = scanner.nextInt();
        int M1 = scanner.nextInt();
        int S1 = scanner.nextInt();
        System.out.println((H1 - H)*60*60 + (M1 - M)*60 + S1-S);

    }


}