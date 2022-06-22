package javaStart;

import java.util.Arrays;

public class Matrioszka {
    public static void main(testString[] args) {

        //int sizeArray = 5;
        int [] filling = {11, 22, 33, 44, 55};
        int tempVal;
        int rotationSumNum = 2;

        for (int j = 0 ; j < rotationSumNum; j++) {
            tempVal = filling[filling.length-1];
            for (int i = filling.length - 1; i > 0; i--) {
                filling[i] = filling[i - 1];

            }
            filling[0] = tempVal;
        }
        System.out.println(Arrays.toString(filling));





    }
}