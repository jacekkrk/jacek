package myJavaStart.loops.Szpital;

import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {




        HospitalApp app = new HospitalApp();
        app.startApp();


    }

    private void startApp() {

        final int dodajPacjeta = 1;
        final int pokazPacjetow = 2;
        final int wizytaSpecjalna = 3;
        final int wyjscie = 0;
        Scanner sc = new Scanner(System.in);
        int option = -1;
        Hospital work = new Hospital();
        while (option != 0) {
            menuApp();
            option = sc.nextInt();
            Patient patientObject = new Patient();

            switch (option) {
                case dodajPacjeta:
                  ;
                    System.out.println("Podaj imie pacjeta");
                    patientObject.setFirstname(sc.next());
                    System.out.println("Podaj nazwisko pacjeta");
                    patientObject.setLastname(sc.next());
                    System.out.println("Podaj pesel");
                    patientObject.setPESEL(sc.next());
                    work.addPatient(patientObject);
                    break;
                case pokazPacjetow:
                    work.showAddPatient();
                    break;
                case wizytaSpecjalna:
                    //patientObject = Patient("jajaj", "ajaj", "2812882");
                    //1work.addPatient(specpatientObject);
                    break;
                case wyjscie:
                    System.out.println("Zakonczono program");
                    break;
            }


        }
    }

    private void menuApp() {
        System.out.println("Witamy w programie przychodnia");
        System.out.println("1 - dodaj pacjeta");
        System.out.println("2 - pokaz zarejestrowanych pacjetow ");
        System.out.println("3 - dodaj pacjeta VIP ");
        System.out.println("0 - zakoncz program");
    }

}
