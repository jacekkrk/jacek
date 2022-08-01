package Wyjatki;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUser  {

    String name;
    String surname;
    int age;

    boolean writeNewUser ( String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

        try (BufferedWriter wr = new BufferedWriter(new FileWriter(name + ".txt"))) {
            wr.write(name + "\t");
            wr.write(surname + "\t");
            wr.write(age + "\t");
            wr.close();
            return true;
        } catch (Exception e ) {
        //    throw new RuntimeException(e);
            return false;
        }



    }
}
