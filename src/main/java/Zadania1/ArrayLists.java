package Zadania1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ArrayLists {

    public static void main(String[] args) {

        List <Integer> myList = new ArrayList<>();

        Random rNum = new Random();
        int numA = rNum.nextInt(10);
     for (int i = 0; i < 100; i++) {
         myList.add(rNum.nextInt(10, 176));
     }
        for (Integer o : myList) {
            System.out.println(o);
        }

        myList.sort(Comparator.naturalOrder());
        System.out.println(myList);


    }

}
