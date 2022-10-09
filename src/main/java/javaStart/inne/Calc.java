package javaStart.inne;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

         Calc Policz = new Calc();
        System.out.println(Policz.add(number1,number2));

    }
    int add(int number1, int number2) {
        return number1 + number2;
    }
    int odd(int number1, int number2) {
        return number1 - number2;
    }

}
