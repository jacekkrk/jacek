package Wyjatki;

import java.util.*;

public class Main3 {


    public static String getDayOfWeekName(int number) {
        String ans = null;
        switch (number) {
            case 1:
                ans = "Mon";
                break;
            case 2:
                ans = "Tue";
                break;
            case 3:
                ans = "Wed";
                break;
            case 4:
                ans = "Thu";
                break;
            case 5:
                ans = "Fri";
                break;
            case 6:
                ans = "Sat";
                break;
            case 7:
                ans = "Sun";
                break;
            default:
                throw new IllegalArgumentException();
        }
        return ans;
        }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayNumber = scanner.nextInt();
        try {
            System.out.println(getDayOfWeekName(dayNumber));
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
    }
}