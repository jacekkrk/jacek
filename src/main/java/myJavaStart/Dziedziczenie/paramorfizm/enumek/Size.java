package myJavaStart.Dziedziczenie.paramorfizm.enumek;

public enum Size {
    SMOLL("Mały"), MEDIUM("Średni"), BIGMAMA("DUZY");

    private final String discription;

public String discription()
{
    return this.discription;
}
    Size(String discription) {
        this.discription = discription;
    }



}
