package myJavaStart.Dziedziczenie.superek;

public class Fruit {

    private double weight;
    private String fruitTyp;


    public String getInfo() {

        return fruitTyp + " " + weight;
    }

    public Fruit(double weight, String fruitTyp) {
        this.weight = weight;
        this.fruitTyp = fruitTyp;
    }
}
