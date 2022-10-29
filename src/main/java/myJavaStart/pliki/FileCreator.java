package myJavaStart.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FileCreator {

    public static void main(String[] args) throws FileNotFoundException {


        File plik = new File("C:/Users/jgrzybowski/IdeaProjects/jacekGit/src/main/java/myJavaStart/pliki/myFile.txt");
        boolean exists = plik.exists();
        System.out.println(exists);
        System.out.println(plik.getAbsolutePath());
        System.out.println(plik.getTotalSpace());
        Scanner sc = new Scanner(plik);

        int lines = 0;
        while (sc.hasNextLine()) {
            String readTxt = sc.nextLine();
            System.out.println(readTxt);
            lines++;
        }
        System.out.println("Liczba wierszy to " + lines);
        sc.close();
    }
}
