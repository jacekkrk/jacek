package Zadania;

public class showABCDforLoop {


    public static void main(String[] args) {



        char startChar;

        for (startChar = 'A' ; startChar <= 'Z'; startChar++){

            System.out.print(startChar + " ");
        }
        System.out.println("");

        for (startChar = 'Z' ; startChar >= 'A'; startChar--){

            System.out.print(startChar + " ");
        }



    }

}
