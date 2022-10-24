package myJavaStart.mojeAbstrakcje;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe slow");
       try {
           int nuberWord = sc.nextInt();
           int i =0;
           String insertWord;
           StringBuilder password = new StringBuilder();;
           do {
               insertWord = sc.next();
               password.append(  insertWord.charAt(insertWord.length()-1));

               i++;

           }while (i < nuberWord);
           String my = password.toString();
           System.out.println(my.toUpperCase());
           sc.close();
       }
         catch (InputMismatchException e){

             System.out.println("j pis");
         }



    }
}
