package Zadania1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class rectangleS {
    // This is class for calculate rectangle area

    static double sideA = 0, sideB = 0, calculationArea;
    static double jPis = 4.5563;
    static double jPis2 = 7.5563;

    public static void main(String[] args) {

    }
    public void czytaj_dane() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.printf("Podaj dlugosc boku a ? ");
            sideA = Double.parseDouble(br.readLine());
            System.out.printf("Podaj dlugosc boku b ? ");
            sideB = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void przetwórz_dane() {
        calculationArea = sideA * sideB;
    }

    public void wyswietl_wyniki() {
        System.out.printf("Obliczenia pola prostokata \nBok A %2.2f \nBok B %2.2f \nJaki jest wynik ? = %2.2f",
                sideA, sideB, calculationArea);


    }
}
