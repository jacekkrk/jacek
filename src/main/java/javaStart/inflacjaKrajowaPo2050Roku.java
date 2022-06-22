package javaStart;

import java.util.Scanner;

public class inflacjaKrajowaPo2050Roku {

                public static int getNumberOfMaxParam(int a, int b, int c) {
                        int max = Math.max(a, Math.max(b,c));

                        return  max == a ? 1 : max == b ? 2 : 3 ;

                }

                public static void main(testString[] args) {

                        Scanner scanner = new Scanner(System.in);

                        final int a = scanner.nextInt();
                        final int b = scanner.nextInt();
                        final int c = scanner.nextInt();

                        System.out.println(getNumberOfMaxParam(a, b, c));
                }
        }