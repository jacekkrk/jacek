package Zadania;

public class MatrixInvert {


    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        for (int y = 0; y < matrix.length; y++) {

            for (int x = 0; x < matrix.length; x++) {
                if (x == 0)  matrix[y][x] = y;
                if (x == 1) matrix[y][x] = y*y;




                else {
                    matrix[x][y] = 0;
                }
            }
        }


        for (int z= 0 ; z < matrix.length ; z++)
        {
            for (int a= 0 ; a < matrix.length ; a++){
                System.out.print(matrix[z][a] + " ");
            }


                System.out.println();
        }

    }


}



