package myJavaStart.Dziedziczenie.paramorfizm.Dziekanat;

public class Dzienny extends Student{

    private boolean przyjety;
    @Override
    String info() {
        return super.info() + " Student ma wykłady w tygodniu" + " Kierunek " + kierunek;
    }

    public Dzienny(Kierunek kierunek, String imie, String nazwisko, int wiek) {
        super(kierunek, imie, nazwisko, wiek);
    }

    public Dzienny() {
    }

    public boolean isPrzyjety() {
        return przyjety;
    }

    public void setPrzyjety(boolean przyjety) {
        this.przyjety = przyjety;
    }
}
