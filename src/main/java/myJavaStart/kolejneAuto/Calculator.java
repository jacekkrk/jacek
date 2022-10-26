package myJavaStart.kolejneAuto;

import fiszkoteka.UnknownOperatorException;

public class Calculator {

//private double numberA;
//private double numberB;
//private String operation;

    public static void main(String[] args) {

   CalculatorLogic xy = new CalculatorLogic();

        try {
            System.out.println(xy.count(15,0,"x"));
        } catch (UnknownOperatorException e) {
            throw new RuntimeException(e);
        }


    }

}
