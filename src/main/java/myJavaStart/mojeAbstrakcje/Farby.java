package myJavaStart.mojeAbstrakcje;

public enum Farby {
    RED("Czerwony"), BLUE("Niebieski"), BLACK("Czarny"), WHITE("Bialy");

    private String opis;

    Farby(String kolor) {
        this.opis = kolor;
    }

    public String getOpis() {
        return opis;
    }
}
