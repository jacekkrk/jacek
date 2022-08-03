package sklep;

public class Osoba implements FirstInterface {
    @Override
    public void dzieńDobry(String whatDayIs) {
        System.out.printf("Dzień dobry w %s" , whatDayIs);
    }
}
