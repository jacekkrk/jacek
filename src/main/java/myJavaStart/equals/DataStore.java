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
            if (computerDatum == null)
            break;
            else {
                System.out.println(computerDatum);
            }
        }

    }
    void checkAvailability(Computer komp){
        int coputerStos = 0;
        for (Computer computerDatum : computerData) {
            if (computerDatum == null)
                break;
            else if(computerDatum.equals(komp)) coputerStos++;

            }
        System.out.println("Komputerow takich samych jest = " + coputerStos);
        }

    }

