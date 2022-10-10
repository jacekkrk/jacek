package Zadania;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class SumDifference {
  float a, b;

    public static void main(String[] args) throws Exception {

        float a, b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Float.parseFloat(br.readLine());
        b = Float.parseFloat(br.readLine());
        System.out.println(add(a,b));
        System.out.println(odd(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));

    }

    static float add(float a, float b) {
        return a + b;
    }

    static float odd(float a, float b) {
        return a - b;
    }

    static float mul(float a, float b) {
        return a * b;
    }

    static float div(float a, float b) {
        return a / b;
    }
}

