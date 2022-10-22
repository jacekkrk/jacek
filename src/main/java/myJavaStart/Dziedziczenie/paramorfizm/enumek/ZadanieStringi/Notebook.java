package myJavaStart.Dziedziczenie.paramorfizm.enumek.ZadanieStringi;

public class Notebook {
    public static void main(String[] args) {


        DataStore data = new DataStore();

        data.add(new Computer("panasonic","onki"));
        data.add(new Computer("paaaa","oni"));


        data.showComputer();
        data.checkAvailability(new Computer("paaaa","oni"));
    }
}
