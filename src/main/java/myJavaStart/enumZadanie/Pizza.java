package myJavaStart.enumZadanie;

import java.util.Arrays;

public enum Pizza  {
    MARGHERITA("sos","pomidorowy", "ser", "33.5"),
    CAPRICIOSA("sos pomidorowy", "ser", "pieczarki" , "40,5"),
    PROSCIUTTO("sos pomidorowy",  "ser",  "szynka" , "52,39");

   final private String[] discription;

    Pizza(String... discription) {

        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Skladniki " + Arrays.toString(discription) ;

    }
}
