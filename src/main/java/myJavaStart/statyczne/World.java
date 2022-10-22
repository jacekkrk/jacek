package myJavaStart.statyczne;

public class World {
    public static void main(String[] args) {

        Human adam = new Human("Adam", 172);
        Human ewa = new Human("Ewa", 158);

        Human.avgheight  = ( adam.getHeight() + ewa.getHeight() ) / 2;


        System.out.println("Pierwsi ludzie na ziemi");
        System.out.println(adam.getName() + " " + adam.getHeight());
        System.out.println(ewa.getName() + " " + ewa.getHeight());

        System.out.println("Sredni wzrost");
        System.out.println(Human.getAvgheight());
    }
}
