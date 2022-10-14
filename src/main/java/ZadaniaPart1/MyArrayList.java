package ZadaniaPart1;

import java.util.Random;

public class MyArrayList {

    int[] RandomNumMatrix = new int[6];


    public static void main(String[] args) {

        MyArrayList start = new MyArrayList();
        start.genRandomSixNumber();
        start.schowMatrix(start.RandomNumMatrix);
    }

    private void genRandomSixNumber() {
        Random rNum = new Random();
        rNum.nextInt();
        for (int i = 0; i < RandomNumMatrix.length; i++) {
            RandomNumMatrix[i] = rNum.nextInt(55);
        //Math.round(10 * rNum.nextInt());


        }

    }

    private void schowMatrix(int[] array){
        for (int i : array) {
            System.out.println(i);

        }
    }
}
