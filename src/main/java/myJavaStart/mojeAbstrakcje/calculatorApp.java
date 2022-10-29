package myJavaStart.mojeAbstrakcje;

import java.util.InputMismatchException;
import java.util.Scanner;


public class calculatorApp {
    public static void main(String[] args) {

        calculatorApp calc = new calculatorApp();
        calc.schowMenu();

    }

    void schowMenu() {

        String menuText = """
                Program do obliczania obwodow i pol
                    dla trojkatow prostokatow kol
                """;
        String menuOption = """
                Podaj nazwe figury do dalszych obliczen
                trojkat prostokat lub kolo ?""";

        System.out.println(menuText);
        System.out.println(menuOption);
        imputData();
    }

    void makeCalc(Schape e) {
        double perimiter = e.calculatePerimeter();
        double area = e.calculateArea();
        System.out.printf("%s %.2f %s %.2f\n" , "Pole figury wynoi ", area , " Obwod figury ", perimiter );

    }

    void imputData() {
        Scanner sc = new Scanner(System.in);
        try {
            String option = sc.next();
            switch (option) {
                case "trojkat":
                    System.out.println("Podaj dlogosc boku a = ");
                    int a = sc.nextInt();
                    Schape trojkat = new Triangle(a);
                    makeCalc(trojkat);
                    break;
                case "prostokat":
                    System.out.println("Podaj dlogosc boku a = ");
                    a = sc.nextInt();
                    System.out.println("Podaj dlogosc boku b = ");
                    int b = sc.nextInt();
                    Schape prostokat = new Rectangle(a, b);
                    makeCalc(prostokat);
                    break;
                case "kolo":
                    System.out.println("Podaj dlogosc promienia r = ");
                    int r = sc.nextInt();
                    Schape circle = new Circle(r);
                    makeCalc(circle);
                    break;
                default:
                    System.out.println("wpisz nazwe figury");
            }

        } catch (InputMismatchException e) {
            System.err.println("Wpisales cos zle uruchom jeszcze raz program");
        }
        finally {
            sc.close();
        }


    }
}


