package javaStart.klasyAbstrakcyjne;

abstract public class Vehicle {

    private int speed;

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;

    }

    abstract protected void uruchomSilnik();
    }

