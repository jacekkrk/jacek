package myJavaStart.enumZadanie.KlasaAnonimowa;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {

        Sortable test = new Sortable() {

            @Override
            public int[] stort(int[] args) {
                for (int i = args.length - 1; i > 0; i--) {
                    for (int k = args.length - 1; k > 0; k--) {
                        if (args[k] < args[k - 1]) {
                            int tempHigh = args[k - 1];
                            args[k - 1] = args[k];
                            args[k] = tempHigh;
                        }
                    }


                }
                return args;
            }
        };

        System.out.println("Liczby do posortowania");

        int[] mySort = {12, 10, 5, 98, 3, 87, 8, 123};

        System.out.println(Arrays.toString(mySort));

        int[] posortwane = test.stort(mySort);

        System.out.println("Liczby po sortowaniu");
        System.out.print("[");
        for (int i : posortwane) {
            System.out.print(i + "," + " ");
        }
        System.out.println("]");
    }
}
