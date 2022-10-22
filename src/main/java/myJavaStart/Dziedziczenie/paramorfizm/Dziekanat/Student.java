package myJavaStart.Dziedziczenie.paramorfizm.Dziekanat;

public class Student {

    Kierunek kierunek;
    private String imie;
    private String nazwisko;
    private int wiek;


    String info(){

        return imie + ' ' + nazwisko + " " +wiek;
    }

    public Student(Kierunek kierunek, String imie, String nazwisko, int wiek) {
        this.kierunek = kierunek;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Student() {

    }

    public Kierunek getKierunek() {
        return kierunek;
    }

    public void setKierunek(Kierunek kierunek) {
        this.kierunek = kierunek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}

