package Zadania.Point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectOriented {

    int sideX, sideY;
    int wynik;
public void czytaj_dane()  throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    this.sideX = Integer.parseInt(br.readLine());
    this.sideY = Integer.parseInt(br.readLine());

}
public void przetworz_dane(){

    this.wynik = sideX * sideY;

}
public void wyswietl_wyniki(){
    System.out.println(wynik);

}
}

