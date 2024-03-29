package myJavaStart.mojeAbstrakcje;

public class Rectangle implements Schape {
    private double a;
    private double b;

    @Override
    public double calculatePerimeter() {


        return 2 * ( a + b );
    }

    @Override
    public double calculateArea() {

        return a * b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
