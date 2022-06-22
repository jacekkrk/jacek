package javaStart;

import java.util.Scanner;

public class testString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Text = "Java";
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        for (int ix = 0; ix < Text.length(); ix++) {
            if (ix >= i && ix <= j ) {
                System.out.print(Text.charAt(ix));


            }
            }
        }
    }
