package myJavaStart.Dziedziczenie.zadanie;

public class ExhaustPart extends Parts {

    private boolean euCertificate;

    public ExhaustPart(int id, String producer, String model, String serialNumber, boolean euCertificate) {
        super(id, producer, model, serialNumber);
        this.euCertificate = euCertificate;
    }


}
