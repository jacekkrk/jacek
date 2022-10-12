package Zadania;

import java.util.regex.MatchResult;

public class Macierz {
    public static void main(String[] args) {

        int[][] matrix  = new int[10][10];
        int indexX = 0;
        int indexY = 0;

        while (indexX < matrix.length){

            while (indexY < matrix.length){

                matrix[indexX][indexY] = 0;
                if(indexX == 1 && indexY == 0) matrix[indexX][indexY] = 2;
                if(indexX == 0 && indexY == 1) matrix[indexX][indexY] = 3;

                if(indexX == indexY) matrix[indexX][indexY] = indexX;
                if(indexX == 9 && indexY == 9) matrix[indexX][indexY] = 7;

                System.out.print(matrix[indexX][indexY] + " ");
                indexY++;
            }
            System.out.println();
            indexX++;
            indexY = 0;
        }
        for (int[] innerArray : matrix)
        {

            //co to to robi
            System.out.print("ttt");
            for (int val : innerArray)
            {
                System.out.print(val);
            }
            System.out.println();
        }

    }


}
