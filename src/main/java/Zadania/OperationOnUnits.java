package Zadania;

import java.awt.*;
import java.util.Random;

public class OperationOnUnits {
    public static void main(String[] args) {


        TimeUnits przelicz = new TimeUnits();

      /*  int wynik = przelicz.hourToMinutes(1);
        wynik = przelicz.minutesToSecends(wynik);
        wynik = przelicz.secendsToMilisecends(wynik);
        System.out.println(wynik);
       */
        Random rHours = new Random();
        int a = rHours.nextInt(72);
        przelicz.showConvertTimeInsertHour(a);

    }
}
