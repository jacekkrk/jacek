package myJavaStart.kolejneAuto;

import fiszkoteka.UnknownOperatorException;

public class CalculatorLogic {


    double count(double numberA, double numberB, String operator) throws UnknownOperatorException {

        switch (operator){

            case "+": return numberA + numberB;

            case "-": return numberA - numberB;

            case "*": return numberA * numberB;

            case "/":

                if (numberB != 0) return numberA / numberB;
                throw new ArithmeticException("Jebac PIS");


            default:
                throw new UnknownOperatorException("Jebac pis");

            }



    }

}
