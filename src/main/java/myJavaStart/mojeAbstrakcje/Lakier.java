package myJavaStart.mojeAbstrakcje;

abstract class Lakier {
     private boolean isPainted = false;
     private Farby color;

   abstract void Pomaluj(Farby kolor);

    public boolean isPainted() {
        return isPainted;
    }

    public void setPainted(boolean painted) {
        isPainted = painted;
    }

    public Farby getColor() {
        return color;
    }

    public void setColor(Farby color) {
        this.color = color;
    }
    void zapytajKlaseAbstrakt(){
        System.out.println("Siema ziom to void z klasy abstrakt nie abstrakt ");
    }
}
