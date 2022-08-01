package sklep;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Gtravel extends CheckStack {

    public static void main(String[] args) {
        Gtravel bike = new Gtravel();
        bike.printListFromFile("gravel");
        for (int i =0; i < 1000 ; i++){
            bike.addBike("gravel" , "Aspre 2" , 14 + i);
        }

        bike.printListFromFile("gravel");
    }
}
