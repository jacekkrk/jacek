package Zadania.Point;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixRing {

    public static void main(String[] args) {

        int[][] a = new int[10][10];
        int[][] b = new int[10][10];
        for (int[] row : b) {
            Arrays.fill(row, 0);

        }

        for (int i = 0; i < a.length; i++) {

            for (int k = 0; k < a.length; k++) {
                a[i][k] = k;

            }
        }

        for (int e = 0; e < a.length; e++) {

            for (int r = 0; r < a.length; r++) {

                b[e][r] = a[r][e];


            }


        }


        for (int z = 0; z < b.length; z++) {
            for (int aa = 0; aa < b.length; aa++) {
                System.out.print(b[z][aa] + " ");
            }


            System.out.println();
        }
        int temp = 0;
        for (int[] ints : b) {
            for (int anInt : ints) {

                if (anInt != temp) System.out.println();
                System.out.print(anInt + " ");
                temp = anInt;
            }
        }

    }

}
