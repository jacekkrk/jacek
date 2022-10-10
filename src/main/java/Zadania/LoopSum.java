package Zadania;

public class LoopSum {


    public static void main(String[] args) {

        int numToSum = 100;
        int agregate = 0;
        int resoult = 0;
        for ( int i  = 0; i <= numToSum; i++ ){

            resoult +=  i;
            System.out.print(resoult + " ");
            if(agregate == 10 ) {
                System.out.println();
                agregate = 0;
            }
            agregate++;
        }

    }

}
