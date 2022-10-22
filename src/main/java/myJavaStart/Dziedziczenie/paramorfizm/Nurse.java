package myJavaStart.Dziedziczenie.paramorfizm;

public class Nurse extends Person {

    double overtime;

    public Nurse(String firstName, String lastName, double salary, double overtime) {
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    String showMe() {

        return "Imie " + getFirstName() + " Nazwisko" + " " + getLastName()
                + " Pensja" + " " + getSalary() + " Nadgodziny " + getOvertime();
    }

}

