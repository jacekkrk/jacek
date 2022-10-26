package myJavaStart.equals;

public class DataStore {


    Computer[] computerData = new Computer[10];
    private int i = 0;

    void add(String name, int model) {
        if (i < computerData.length) {
            this.computerData[this.i] = new Computer(name, model);
            this.i++;
        } else System.out.println("Brak miejsca w magazynie");
    }

    void showCoputer() {
        for (Computer computerDatum : computerData) {
            if (computerDatum.toString() != null) {
                System.out.println(computerDatum);
            }
            else System.out.println("pyu");
        }
    }
}
