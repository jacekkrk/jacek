package myJavaStart.klasyWewiZew;

import java.lang.module.FindException;

public class Car {
    private int fuel;
    private Engine engine;

    public void refuel(int liters) {
        this.fuel = fuel + liters;
    }
public Car()
{
    engine = new Engine("Lambo");
    System.out.println("Utworzono samochod z silnikiem " + engine.engineType);
}
    public class Engine {

        private String engineType;
        private static final int FUEL_CONSUPTION = 20;

        public Engine(String engineType) {
            this.engineType = engineType;
        }

        public void consumeFuel() {
            if (fuel >= FUEL_CONSUPTION)
                fuel = fuel - FUEL_CONSUPTION;
            else
                fuel = 0;
        }
    }
}
