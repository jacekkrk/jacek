package Zadania1.accesModiffers.App;

import Zadania1.accesModiffers.Point;

public class PointAplication {
    public static void main(String[] args) {


        Point point = new Point(9,4);
        PointControler pointControl = new PointControler();
        System.out.println(point.getX());
        pointControl.addX(point);
/*        pointControl.addX(point);

        System.out.println(point.getX());
        pointControl.minusX(point);
        System.out.println(point.getX());

*/
        final int moveup = 0;
        final int moveDown = 1;
        final int moveLeft = 2;
        final int moveRight = 3;    // zmienne sterujace musza byc final w switchu

        int move = 3;

        switch (move){
            case moveup:
                pointControl.addY(point);
                break;
            case moveDown:
                pointControl.minusY(point);
                break;
            case moveLeft:
                pointControl.minusX(point);
                break;
            case moveRight:
                pointControl.addX(point);
                break;
            default:
                System.out.println("Please choice 0 , 1 , 2, 3");
        }


    }
}
