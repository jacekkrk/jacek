package myJavaStart.Dziedziczenie.paramorfizm.enumek;

public enum Producent {
    ADIDAS("USA" , 1), NIKE("CHINY", 2), FOURF("POLSKA", 3), PUMA("UKRAINA" , 4);

    private  int id;
    private String gdzieProdukowane;

    Producent(String gdzieProdukowane, int id) {
        this.gdzieProdukowane = gdzieProdukowane;
        this.id = id;
    }

    public String getProducent(){
        return gdzieProdukowane + " id = " + id;
    }

    public int getId(){

        return id;
    }

    @Override
    public String toString() {
        return "Producent{" +
                "id=" + id +
                ", gdzieProdukowane='" + gdzieProdukowane + '\'' +
                '}';
    }
}
