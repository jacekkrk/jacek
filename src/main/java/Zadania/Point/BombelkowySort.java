package Zadania.Point;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class BombelkowySort {

    public static void main(String[] args) {


        int [] liczby = {12, 7, 10, 8, 49 } ;
        int liczbyTemp;

        for (int i = 4 ; i > 0; i--){

            for (int z = 4 ; z > 0; z--) {
                if (liczby[z] < liczby[z - 1]) {
                liczbyTemp = liczby[z - 1];
                liczby[z - 1] = liczby[z];
                liczby[z] = liczbyTemp;
                }
            }
                        ;  //sprawdzamy 4 < 78 -jest wiec  4 przzsinacj na n-1



            }


        for (int k : liczby) {
            System.out.println(k);
        }
    }



}
