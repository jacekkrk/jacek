package Wyjatki;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ArreyProtectExepction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();

        try {
            System.out.println(string.charAt(index));
        }
        catch (StringIndexOutOfBoundsException  e) {
            System.out.println("Out of bounds!");
        }

    }
}
