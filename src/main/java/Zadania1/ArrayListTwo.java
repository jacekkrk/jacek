package Zadania1;

import java.util.*;

public class ArrayListTwo {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        for (int y = 0; y < 15; y++) array.add(genNumber());
        System.out.println(array);
        Integer tempVal = 0;
        Integer tempVal1 = 0;

        for (int z = 0; z < array.size() - 1; z++) {
            for (int i = 0; i < array.size() - 1; i++) {
                if (array.get(i) > array.get(i + 1)) {
                    tempVal = array.get(i + 1);
                    tempVal1 = array.get(i);
                    array.set(i + 1, tempVal1);
                    array.set(i, tempVal);
                }
            }
        }
        System.out.println();
        System.out.println(array);
        array.remove(2);
        array.add(genNumber());
        Collections.sort(array);

        //    System.out.println(array.get(15));
        System.out.println();
        System.out.println(array);
        System.out.println();
        System.out.println();
        int [] testSort = {12,3,44,76,1,9,2};
        Arrays.sort(testSort);
        for (int i : testSort) {
            System.out.print(i + " ");
        }
        System.out.println();
        sorterNameList();
    }

    static Integer genNumber() {

        Random createRandomNumber = new Random();
        return createRandomNumber.nextInt(100);
    }
    static void sorterNameList() {

        List <String> nameList = new ArrayList<>();

        nameList.add("Renata");
        nameList.add("Gienek");
        nameList.add("Jack");
        nameList.add("John");
        nameList.add("Adam");

        System.out.println("Lista imion do posortowania " + nameList);
        Collections.sort(nameList);
        Collections.reverse(nameList);
        System.out.println(nameList);

    }





}
