package myJavaStart.equals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FiveWords {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Podaj ilosc wyrazow do wprowadzenia ");
        int maxWords = sc.nextInt();

        String[] myWords = new String[maxWords];
        char add;
        int i = 0;

        while (i < myWords.length) {
            System.out.println("Podaj kolejny wyraz ? ");
            myWords[i] = sc.next();
//            add = myWords[i].charAt(myWords[i].length()-1);
//
//            sb.append(add);
            i++;
        }

        for (String myWord : myWords) {

           // add = myWords[i].charAt(myWords[i].length()-1);

            sb.append(myWord.charAt(myWord.length()-1));;
        }
        System.out.println(sb);
    }

}
