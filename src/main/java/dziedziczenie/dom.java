package dziedziczenie;

public class dom implements developer {

    public static String nazwaDomu;
    private int liczbaPieter;
    static int jada;

    public void dom (String args) {
        this.nazwaDomu = args;

    }

    public void setNazwaDomu(int getNazwaDomu) {
        //this.nazwaDomu = getNazwaDomu;
        this.jada = getNazwaDomu;

    }
public String getNazwaDomu() {

        return nazwaDomu;
    }

    @Override
    public void sprzedaj() {
        System.out.println("Sprzedałeś mieszkanie ");
    }

    @Override
    public void kup() {
        System.out.println("Kupiles dom ");
    }
}


//This nie jest do metod statycznych !!!!