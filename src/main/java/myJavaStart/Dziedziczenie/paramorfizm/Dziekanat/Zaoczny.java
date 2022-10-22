package myJavaStart.Dziedziczenie.paramorfizm.Dziekanat;

public class Zaoczny extends Student{

    private boolean przyjety;
    @Override
    String info() {
        return super.info() + " Student ma wykłady w weekendy przyjety " + przyjety + " Kierunek " + kierunek;
    }

    public boolean isPrzyjety() {
        return przyjety;
    }

    public void setPrzyjety(boolean przyjety) {
        this.przyjety = przyjety;
    }

    public Zaoczny(Kierunek kierunek, String imie, String nazwisko, int wiek, boolean przyjety ) {
        super(kierunek, imie, nazwisko, wiek);
        this.przyjety = przyjety;
    }

    public Zaoczny() {

    }

}
