package javaStart;

import java.util.Arrays;
import java.util.Scanner;

public class MacierzPobieranieDanychSpacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int aSizie = scanner.nextInt();
        int[] arrey = new int[aSizie];
        int i = 0;
        int nTimes = 0;
        while (i < arrey.length) {
            arrey[i] = scanner.nextInt();
            i++;
        }

        int checkInArrey = scanner.nextInt();
        for (int checked : arrey){
            if (checked == checkInArrey){
                nTimes ++;
            }

        }
        System.out.println(nTimes);
    }

    }


// do sprawdzenia import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        // put your code here
//        final var scanner = new Scanner(System.in);
//        final var n = scanner.nextInt();
//        final var arr = scanner.tokens().mapToInt(Integer::parseInt).limit(n).toArray();
//        final var numOccurring = scanner.nextInt();
//        var count = 0;
//
//        for (int i : arr) {
//            if (i == numOccurring) {
//                count++;
//            }
//
//        }
//
//        System.out.println(count);
//
//    }
//}