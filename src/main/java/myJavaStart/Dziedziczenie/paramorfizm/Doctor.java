package myJavaStart.Dziedziczenie.paramorfizm;

public class Doctor extends Person {
    private double bonus;

    public Doctor(String firstName, String lastName, double salary, double bonus) {
        super(firstName, lastName, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    String showMe() {

        return "Imie " + getFirstName() + " Nazwisko" + " " + getLastName()
                + " Pensja" + " " + getSalary() + " Bonus" + " " + getBonus();
    }
}
