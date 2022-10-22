package myJavaStart.statyczne;

public class calcTest {
    public static void main(String[] args) {
        double r = 10;
     //   Calculator calc = new Calculator();

        System.out.printf("%s %.1f%n", "Pole kola wynosi " ,  Calculator.circleArea(r));
        System.out.println("Obwod kola wynosi " + Calculator.circlePerimeter(r));

    }
}
