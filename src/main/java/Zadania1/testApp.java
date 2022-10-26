package Zadania1;

public class testApp {

    public static void main(String[] args) {

       /* rectangleS rectangle = new rectangleS();
        rectangle.czytaj_dane();
        rectangle.przetwórz_dane();
        rectangle.wyswietl_wyniki();
   */
    Factorial fact = new Factorial();
    fact.read_data(5);
        System.out.println(fact.result);

    }
}
