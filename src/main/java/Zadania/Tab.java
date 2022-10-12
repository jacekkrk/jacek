package Zadania;

public class Tab {


    public static void main(String[] args) {

        int[] myTab = new int[10];

        int i = 0;
        int tabFirstNumber = 0 ;
        do {

            myTab[i] = tabFirstNumber;
            System.out.printf(i + " " + myTab[i] + "\n");
            tabFirstNumber =  myTab.length - 1 - i;
            i++;
        } while (i < myTab.length);
    }
}
