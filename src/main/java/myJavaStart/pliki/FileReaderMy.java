package myJavaStart.pliki;

import java.io.*;

public class FileReaderMy {
     int cus;
    private int nic;

    public static void main(String[] args) throws IOException {




    }
    void plikuj() throws IOException {

        File plik = new File("C:/Users/jgrzybowski/IdeaProjects/jacekGit/src/main/java/myJavaStart/pliki/myFile.txt");
        boolean exists = plik.exists();
        FileReader read = new FileReader(plik);
        BufferedReader reader = new BufferedReader(read);  // roznica ze czyta wiersz po wierszu mozna mu
        // zapodawac sturienie
        String endLine = null;
        int countLine = 0;

        while ((endLine = reader.readLine()) != null) {  // tu ten nawias dla wyrazenia
            // endLine = reader.readLine();
            System.out.println(endLine);
            countLine++;

        }
        System.out.println(countLine);
    }
}
