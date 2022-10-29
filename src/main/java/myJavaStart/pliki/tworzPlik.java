package myJavaStart.pliki;

import java.io.File;

public interface tworzPlik {


    default File pis(){


        File plik = new File("C:/Users/jgrzybowski/IdeaProjects/" +
                "jacekGit/src/main/java/myJavaStart/pliki/myFile.txt");
        return plik;
    }
    double calculatePerimeter();
}
