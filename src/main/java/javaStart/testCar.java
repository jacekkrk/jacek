package javaStart;

public class testCar {
    public static void main(String[] args) {
        Car mazda = new Car();
      //  mazda.speed = 10;
        mazda.accelerate();
        mazda.accelerate();
        mazda.brake();
        System.out.println(mazda.speed);
    }



}
