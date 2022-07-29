package Wyjatki;

import java.util.Scanner;

public class Main {

    static int mymax;

    public static void main(String[] args) {

        Scanner insertumber = new Scanner(System.in);
        int x0 = insertumber.nextInt();
        int arrey[] = new int[x0];

        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = insertumber.nextInt();

        }

        for (int k = 0; k < arrey.length; k++) {
            if (k == 1) {
                mymax = (Math.max(arrey[k], arrey[k - 1]));
            }

            mymax = Math.max(mymax, arrey[k]);
        }
        for (int z = 0; z < arrey.length; z++) {
            if (arrey[z] == mymax) {
                System.out.println(z);
                break;
            }
        }
    }
}
