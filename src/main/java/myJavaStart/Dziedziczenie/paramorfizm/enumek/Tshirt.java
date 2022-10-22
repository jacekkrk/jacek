package myJavaStart.Dziedziczenie.paramorfizm.enumek;

public class Tshirt {
    private Size size;
    private Producent producent;

    public Size getSize() {
        return size;
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public Tshirt(Size size, Producent producent) {
        this.size = size;
        this.producent = producent;
    }
    //    public static final int SMALL = 1;
//    public static final int MEDIUM = 2;
//    public static final int LARGE = 3;
//
//    private int size;
//
//    public int getSize() {
//        return size;
//    }
//
//    public void setSize(int size) {
//        this.size = size;
//    }

}
