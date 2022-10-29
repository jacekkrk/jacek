package myJavaStart.enumZadanie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Pizzeria MyPizza = new Pizzeria();
        MyPizza.menu();
        MyPizza.getMenu();
    }

    private void menu() {
        System.out.println("Nasze menu");
        for (Pizza value : Pizza.values()) {
            System.out.println(value.name() + " " + value);
        }
    }

    private void getMenu() throws InputMismatchException, IllegalArgumentException {
        System.out.println("Prosze zlozyc zamowienie :");
        Scanner sc = new Scanner(System.in);
        String pizzachoice = sc.nextLine().toUpperCase();
        boolean correct = false;
        do {
            try {
                Pizza toEnum = Pizza.valueOf(pizzachoice);
                correct = true;
            } catch (IllegalArgumentException e) {
                System.err.println("nie ma takiej pizzy");
                System.out.println("wybierz inna pizze ");
                pizzachoice = sc.nextLine().toUpperCase();
            }
        } while (!correct);
        Pizza toEnum = Pizza.valueOf(pizzachoice);

        for (Pizza value : Pizza.values()) {

            if (value == toEnum) {
                System.out.println(value.name() + " " + value);
            }

        }
    }
}
