package Wyjatki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main4 {

    public static void method() throws FileNotFoundException {
        String fileName = "file does not exist";
        File file = new File(fileName);
        FileInputStream stream = new FileInputStream(file);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }

}
