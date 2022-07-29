package Wyjatki;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int k = n.nextInt();

        int [] [] myArr = new int [k] [k];
        for (int i  = 0; i < myArr.length; i++) {
            for (int z = 0; z < myArr[i].length; z++) {


               myArr[i][z] = Math.abs(i - z);


                System.out.print(myArr[i][z] + " " );

                }
            System.out.println();

            }
        }


    }




