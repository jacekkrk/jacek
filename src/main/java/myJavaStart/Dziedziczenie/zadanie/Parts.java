package myJavaStart.Dziedziczenie.zadanie;

public class Parts  {
    //posiada swój unikalny numer identyfikacyjny, przechowuje nazwę producenta, model i serię produktu
    private int id;
    private String producer;
    private String model;
    private String serialNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Parts(int id, String producer, String model, String serialNumber) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.serialNumber = serialNumber;
    }
}