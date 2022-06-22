package javaStart;

import java.util.Scanner;

public class SumArreyNumbers {
    public static void main(testString[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] myArr = new int[arraySize];
        for (int i =0; i < arraySize; i++) {
            myArr[i] = scanner.nextInt();
        }
        int sumArrNum = 0;
        for (int k : myArr) {
            sumArrNum += k;
        }
        System.out.println(sumArrNum);
    }
}




        /*
        int sumArrNum = 0;
        for (int k = 0; k < myArr.length; k++) {
            sumArrNum += myArr[k];
        }
        System.out.println(sumArrNum);
    }
}
*/