package myJavaStart.equals;

import java.util.Objects;

public class NotebookShop {

    public static void main(String[] args) {
        DataStore sklep = new DataStore();
        sklep.add("Optius", 1);
        sklep.add("makus", 2);
        sklep.add("zeno", 6);
        sklep.add("Optius", 1);
        sklep.add("Optius", 1);
        sklep.showCoputer();
        sklep.checkAvailability(new Computer("Optius", 1));
    }

}