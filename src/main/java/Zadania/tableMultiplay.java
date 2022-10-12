package Zadania;

public class tableMultiplay {


    public static void main(String[] args) {


        int ix = 1;
        do{
            int iy = 1;
            do {
                System.out.print( ix * iy + " ");
                iy++;
            }while (iy <= 10);
            System.out.println();

        ix++;
        }while (ix <= 10);
    }
}
