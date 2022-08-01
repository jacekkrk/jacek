package sklep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddStack {
    boolean addBike (String typ, String name, int qty) {

        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter(typ +".txt" , true));
            wr.write(name + " " +qty +"\n");
            wr.close();
            return true;
        } catch (IOException e) {
            System.out.println("blad");;

            return false;
        }


    }

}
