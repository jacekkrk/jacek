package MyInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void log(String text) {
        try {
            File file = new File("logs.txt");
            FileWriter writer;
            writer = new FileWriter(file);


            writer.write("zazu");
            writer.close();
            System.out.println(file.canRead() + " " + file.canWrite());

        } catch (IOException e) {
            System.out.println();
        }
    }
}
