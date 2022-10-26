package javaStart.klasyAbstrakcyjne;

public class SpeedTest {

    public static void main(String[] args) {

        Car car = new Car();
        Plane plane = new Plane();
        car.uruchomSilnik();
        plane.uruchomSilnik();
        car.speedUp();
        plane.speedUp();
        System.out.println(car.getSpeed() + " " + plane.getSpeed());
        System.out.println( plane.getSpeed());

    }
}
