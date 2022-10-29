package myJavaStart.mojeAbstrakcje;

public class Circle implements Schape, Hi{

    double r;

    @Override
    public double calculatePerimeter() {
        return Schape.Pi * r * r;
    }

    @Override
    public double calculateArea() {

        return 2 * Schape.Pi * r;
    }

    public Circle(double r) {
        this.r = r;
    }


}
