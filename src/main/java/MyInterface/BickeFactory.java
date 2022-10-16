package MyInterface;

public class BickeFactory implements BikeType {


    int frameSize;
    int sizeVchels;
    String Info = "inProduction";

    public static void main(String[] args) {


        BickeFactory[] aa = new BickeFactory [5];

        for (BickeFactory bickeFactory : aa) {
         System.out.printf("a");
        }

       // aa.production();
       // System.out.printf(aa.info() + " " + aa.frameSize);

    }


    private void production() {

        frameSize(4);
        this.Info = info();
    }


    @Override
    public void frameSize(int size) {
        this.frameSize = size;
    }

    @Override
    public String info() {

        return "Produkcja zakonczona";
    }


}


