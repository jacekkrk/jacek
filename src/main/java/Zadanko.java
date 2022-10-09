import java.util.Scanner;

public class Zadanko {

    public static void main(String[] args) {
        Scanner insertNumber = new Scanner(System.in);

        int[] tablica = new int[]{1, 3, 4, 6, 8,9 ,12 };
        int tabTemp, tabTemp1;
        for (int i : tablica) {
            System.out.print(i + " ");
        }
        int next = 0;
        for (int k = tablica.length - 1; k > 0.5*tablica.length ; k--) {
            tabTemp = tablica[k]; // ostatnia
            tabTemp1 = tablica[next]; // pierwsza
            tablica[next] = tabTemp;
            tablica[k] = tabTemp1;
            next++;

        }
        System.out.println();
        for (int o : tablica) {
            System.out.print(o + " ");
        }

    }
}

