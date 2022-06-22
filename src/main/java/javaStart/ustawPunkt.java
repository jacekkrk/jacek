package javaStart;

public class ustawPunkt {

    public static void main(testString[] args) {

        Punkt point = new Punkt();
        point.ustawX(5);
        point.ustawY(56);

      //  point.wspolrzednaX = 100;
    //    point.wspolrzednaY = 45;
    //    System.out.println("Wprowadzone punkty to " + point.wspolrzednaY + " i " +point.wspolrzednaX);

  //      int a = point.dajX();
    //    int b = point.dajY();

        System.out.println(point.dajX() + " " + point.dajY());
    }
}
