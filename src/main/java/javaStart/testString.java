package javaStart;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class testString {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String textOne = scanner.nextLine();
            String textTwo  = scanner.nextLine();
            String textOneN = textOne.replace(" ", "");
            String textTwoN = textTwo.replace(" ", "");
            System.out.println(textOneN.contains(textTwoN));


        }
    }