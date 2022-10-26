package javaStart.klasyAbstrakcyjne;

public class Car extends Vehicle {


 public void   speedUp(){

     setSpeed(getSpeed() + 5);


    }

    @Override
    protected void uruchomSilnik() {
        System.out.println("Samochod odpalil");
    }
}
