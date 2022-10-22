package myJavaStart.loops;

import java.util.Scanner;

public class loopOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberLoops = sc.nextInt();
        int result = 0;

        for (; numberLoops > 0; numberLoops--) {

            result *= sc.nextInt();

        }
        sc.close();
        System.out.println(result);
    }
}
