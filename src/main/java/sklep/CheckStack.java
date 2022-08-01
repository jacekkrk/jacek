package sklep;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckStack extends AddStack {
    void printListFromFile(String typ) {

        try {
            BufferedReader wr = new BufferedReader(new FileReader(typ +".txt"));
            String readline;
            while ((readline = wr.readLine()) != null) {
                System.out.println(readline);
            }
            wr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
