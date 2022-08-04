package Wyjatki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Spr {
    public static void main(String[] args) throws IOException {
       // FileWriter wr = new FileWriter("test.txt");
        try (Scanner scanner = new Scanner(new File("test.txt"))) {

            int number = scanner.nextInt();

            System.out.println(number * 100);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally part");
        }
    }
}
