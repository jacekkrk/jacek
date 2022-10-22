package myJavaStart.Dziedziczenie.paramorfizm.Dziekanat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;


public class DziekanatApp {

    List<Student> zapisy = new ArrayList<>();

    public static void main(String[] args) {

        DziekanatApp dziek = new DziekanatApp();

        dziek.zapisy.add(new Dzienny(Kierunek.ELEKTROTECHNIKA, "Jan", "Litwinko", 17));
        dziek.zapisy.add(new Zaoczny(Kierunek.MECHANIKA, "Jacek", "Placek", 21, false));
        dziek.zapisy.add(new Zaoczny(Kierunek.INFORMATYKA, "Michał", "Wajda", 27, true));
        dziek.serwisMenu();


//
//        for (Student student : zapisy) {
//            System.out.println( student.info());
//
//        }

    }

    private void menuShow() {

        System.out.println("1 - Pokaz kierunki studiow");
        System.out.println("2 - Pokaz zapisanych studentów");
        System.out.println("3 - Dodacj studenta");
        System.out.println("0 - Exit Nara");

    }

    private void menuShow1() {

        System.out.println("1 - Dzienny");
        System.out.println("2 - Zaoczny");
        System.out.println("0 - Exit Nara");

    }

    private void menuShow3() {

        for (Kierunek value : Kierunek.values()) {
            System.out.println(value.opisMenu());
        }


    }

    private void serwisMenu() {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            int option = -1;
            while (option != 0) {
                switch (option) {
                    case 1:
                        Kierunek[] kier = Kierunek.values();
                        for (Kierunek kierunek : kier) {
                            System.out.println(kierunek);
                        }
                        break;
                    case 2:
                        for (int i = 0; i < zapisy.size(); i++) {
                            System.out.println(zapisy.get(i).info());

                        }
                        break;
                    case 3:
                            this.menuShow3();
                            this.createStudent(input);
                    break;
                }

                this.menuShow();


                option = Integer.parseInt(input.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
            //System.out.println("Podaj cyfre");
        }


    }

    void createStudent(BufferedReader input) throws IOException {

        int tempWsad = Integer.parseInt(input.readLine());
        Kierunek wybranyKierunek = Kierunek.menuID(tempWsad);
        System.out.println("Podaj Imie");
        String tempName = input.readLine();
        System.out.println("Podaj nazwisko");
        String tempLastName = input.readLine();
        System.out.println("Podaj wiek");
        int tempWiek = Integer.parseInt(input.readLine());
        this.menuShow1();

        int choice = Integer.parseInt(input.readLine());

        if(choice == 1) {
            zapisy.add(new Dzienny(wybranyKierunek, tempName, tempLastName, tempWiek));
        }
        if (choice == 2) {
            System.out.println("Bator ");
            zapisy.add(new Zaoczny(wybranyKierunek, tempName, tempLastName, tempWiek, true));
        }
        else
            System.out.println("Blad 404");

    }

}
