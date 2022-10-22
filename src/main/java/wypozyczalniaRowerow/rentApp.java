package wypozyczalniaRowerow;

import java.util.Scanner;

public class rentApp {
    public static void main(String[] args) {
//        Bike bike1 = new Bike("Road", "blue", "Romet",
//                "Huragan 2.0", 2022, 18);
//        Bike bike2 = new Bike("Road", "red", "Kross",
//                "Esker 2.0", 2021, 18);
//        Bike bike3 = new Bike("Cross", "red", "Kross",
//                "Hexagon 3.0", 2021, 18);
//
//
//        rent.addBike(bike1);
//        rent.addBike(bike2);
//        rent.addBike(bike3);
        startMenu();
    }

    private static void startMenu() {
        RentSerwis rent = new RentSerwis();
        Scanner input = new Scanner(System.in);
        final int pokazDostepneRowery = 1;
        final int pokazWypozyczoneRowery = 2;
        final int utworzMagazyn = 3;
        final int wypozycz = 4;
        final int koniecProgramu = 0;
        int option = -1;
        do {
            showScreen();
            switch (option) {
                case pokazDostepneRowery -> rent.showBike();
                case pokazWypozyczoneRowery -> System.out.println();
                case utworzMagazyn -> utworzMagazyn(rent);
                case wypozycz -> rent.rentBike(1);
                case koniecProgramu -> System.out.println();


            }
            option = input.nextInt();

        } while (option != 0);


    }

    private static void showScreen() {
        System.out.println("Witam w programie do zarzadania wypozyczalnia");
        System.out.println("1 - Pokaz dostepne rowery");
        System.out.println("2 - Pokaz wypozyczone rowery");
        System.out.println("3 - Utworz magazyn");
        System.out.println("4 - Wypozycz");
        System.out.println("0 - Wyjscie z programu");

    }

    private static void utworzMagazyn(RentSerwis rent) {

        Bike bike1 = new Bike("Road", "blue", "Romet",
                "Huragan 2.0", 2022, 18);
        Bike bike2 = new Bike("Road", "red", "Kross",
                "Esker 2.0", 2021, 18);
        Bike bike3 = new Bike("Cross", "red", "Kross",
                "Hexagon 3.0", 2021, 18);
        rent.addBike(bike1);
        rent.addBike(bike2);
        rent.addBike(bike3);

    }
}
