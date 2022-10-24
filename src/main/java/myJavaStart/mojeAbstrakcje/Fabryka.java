package myJavaStart.mojeAbstrakcje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Fabryka {
    public static void main(String[] args) {

        Samochod sam = new Samochod();

        System.out.println(sam.getColor());




        String welcome = """
                Witamy w fabryce
                   samochodow
                      FSO 
                Podaj kolor swojego poloneza : 
                """;
        System.out.println(welcome);
        for (Farby farby : Farby.values()) {
            System.out.println(farby);
        }

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String opcja;
            opcja = br.readLine();
            opcja = opcja.toUpperCase();
            Farby opcjaEnum = Farby.valueOf(opcja);

            switch (opcjaEnum) {
                case RED: sam.Pomaluj(Farby.RED);
                    System.out.println("pomalowano na " +sam.getColor().getOpis());
                break;
                case BLACK: sam.Pomaluj(Farby.BLACK);
                    System.out.println("pomalowano na " +sam.getColor().getOpis());
                    break;
                case WHITE:sam.Pomaluj(Farby.WHITE);
                    System.out.println("pomalowano na " +sam.getColor().getOpis());
                    break;
                case BLUE: sam.Pomaluj(Farby.BLUE);
                    System.out.println("pomalowano na " +sam.getColor().getOpis());
                    break;

            }
        } catch (IOException e) {
            System.err.println("jebac Pis");
        } catch (IllegalArgumentException e) {
            System.err.println("jebac Pis i PO");
        }
        sam.zapytajKlaseAbstrakt();

//        System.out.println(zapisz);
    }
}
