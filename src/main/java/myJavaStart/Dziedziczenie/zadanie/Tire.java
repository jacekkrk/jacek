package myJavaStart.Dziedziczenie.zadanie;

public class Tire extends Parts {

    private int size;
    private int width;

    @Override
    public String toString() {
        return "Tire{" +
                "size=" + size +
                ", width=" + width + " " + getId() + " " + getProducer() +
                " " + getModel() + " " + getSerialNumber() +
                '}';

    }

    public Tire(int id, String producer, String model, String serialNumber, int size, int width) {
        super(id, producer, model, serialNumber);
        this.size = size;
        this.width = width;
    }
}

