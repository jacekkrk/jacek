package Zadania1.accesModiffers.App;

import Zadania1.accesModiffers.Point;

public class PointControler {

    public void addX(Point point) {

        int getX = point.getX();
        point.setX(getX + 1) ;


    }
    public void minusX(Point point) {

        int getX = point.getX();
        point.setX(getX - 1) ;


    }

    public void addY(Point point) {

        int getY = point.getX();
        point.setX(getY + 1) ;

    }
    public void minusY(Point point) {

        int getY = point.getX();
        point.setX(getY - 1) ;


    }
}