package javaStart;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class inflacjaKrajowaPo2050Roku {
        public static boolean isVowel(char ch) {
                char[] vowels = {'A', 'E', 'I', 'O', 'U'};
                char character = Character.toUpperCase(ch);
                for (char x: vowels) {
                        if (x == character) {
                                return true;
                        }
                }
                return false;
        }

        /* Do not change code below */
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                char letter = scanner.nextLine().charAt(0);
                System.out.println(isVowel(letter) ? "YES" : "NO");
        }
}