package sklep;

import java.sql.SQLOutput;

public class Dyrektor implements FirstInterface {
    @Override
    public void dzieńDobry(String whatDayIs) {
        System.out.println(" Dzień dobry moje owieczki " + whatDayIs +  "to piękny dzueń");
    }
}
