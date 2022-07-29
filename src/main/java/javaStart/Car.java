package javaStart;

class Car {

    int yearModel;
    String make;
    int speed;
    int tempSpeed;
    void accelerate() {
        this.speed += 5;

    }
    void brake() {

        this.speed -= 5;
        this.speed = speed > 0  ?  speed :  0 ;
    }
}

