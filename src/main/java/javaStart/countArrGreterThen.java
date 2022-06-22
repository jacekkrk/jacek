package javaStart;

import java.util.Scanner;

public class countArrGreterThen {
    public static void main(testString[] args) {
        // put your code here
        final var scanner = new Scanner(System.in);
        final var n = scanner.nextInt();
        final var arr = scanner.tokens().mapToInt(Integer::parseInt).limit(n).toArray();
        final var numOccurring = scanner.nextInt();
        var count = 0;

        for (int i : arr) {
            if (i > numOccurring) {
                count+= i;
            }

        }



    }
}
