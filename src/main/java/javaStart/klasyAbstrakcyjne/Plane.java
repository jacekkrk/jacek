package javaStart.klasyAbstrakcyjne;

public class Plane extends Vehicle{


    public void   speedUp(){

        setSpeed(getSpeed() + 100);


    }

    @Override
    protected void uruchomSilnik() {
        System.out.println("Samolot właczyl silniki");
    }
}
