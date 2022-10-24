package myJavaStart.mojeAbstrakcje;

public class Triangle implements Schape{
    private double a;

   private double h;
    @Override
    public double calculatePerimeter() {
        return a * 3 ;
    }

    @Override
    public double calculateArea() {
        h = (Math.sqrt(3) * a) /2;
        return ( a * h) / 2 ;
    }

    public Triangle(double a) {
        this.a = a;
    }
}
