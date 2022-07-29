package Wyjatki;

import javax.annotation.processing.SupportedSourceVersion;
import java.io.File;

public class FileRead {
    public static void main(String[] args) {
        File file = new File("/Users/KubaG/OneDrive/Dokumenty/JavaGit/TestRepo/JacaAcademy/src/main/java/Wyjatki/myfile.txt");
        System.out.println("File name: " + file.getName());
        System.out.println(file.exists());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println(file.canRead() + " " + file.canWrite());
    }
}
