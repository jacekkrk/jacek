package Zadania.Point;

import java.util.Arrays;

public class BubleSort {


    public static void main(String[] args) {


        int[] poukladajMnie = new int[]{142, 12, 1, 17, 1444};
        int temp;


        for (int k = 4; k > 0; k--) {

            if (poukladajMnie[k] < poukladajMnie[k - 1]) {
                temp = poukladajMnie[k];
                poukladajMnie[k] = poukladajMnie[k - 1];
                poukladajMnie[k - 1] = temp;
            }

        }

        for (int z : poukladajMnie) {
            System.out.println(z);
        }


        int suma = 0;
        int q = 0;
        int[] dane = new int[100];

        do {


            dane[q] = q + 1;

            q++;


        } while (q < dane.length);

        for (int i : dane) {
            System.out.print(i + " ");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        int parzyste = 0, nieparzyste = 0;
        for (int u : dane) {
            suma += u;
            if (u % 2 == 0) parzyste += u;
            else nieparzyste += u;

        }
        System.out.println(suma);
        System.out.println(parzyste);
        System.out.println(nieparzyste);
    }

}

