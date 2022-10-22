package myJavaStart.Dziedziczenie.superek;

public class Apple extends Fruit {

    private String odmiana;


    public Apple(double weight, String fruitTyp, String odmiana) {
        super(weight, fruitTyp);
        this.odmiana = odmiana;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + odmiana;

    }
}
