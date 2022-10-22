package myJavaStart.Dziedziczenie.zadanie;

import java.sql.SQLOutput;

public class testApp {
    public static void main(String[] args) {

        Tire opona = new Tire(21,"Java", "Bins", "Toyota",12 , 121221455);
      //  ExhaustPart wydech = new ExhaustPart(true);
        opona.setId(1);
        System.out.println(opona);
        System.out.println(opona.getId());

    }


}
