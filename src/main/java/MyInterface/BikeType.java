package MyInterface;

public interface BikeType {

    void frameSize(int size);
    String info();

    default int sizeVchels() {
        return 0;
    }



}
