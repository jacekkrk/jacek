package myJavaStart.kolejneAuto;

public class Car {

    private String marka;
    private int fuel = 25;
    private int fuleCapaity = 45;
    private boolean isRun = false;
    private Drive drv;
    Car() {

       Drive drv = new Drive();
        drv.fuelConsumption();
        drv.Bp(15);
        System.out.println(fuel + " " + isRun);

    }





    class Drive {
        final private int CONSUMPTION = 10;


        void fuelConsumption() {

            fuel = fuel - CONSUMPTION;
            isRun = true;
            System.out.println(fuel + " " + isRun);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            fuel = fuel - CONSUMPTION;
        }
            void Bp(int liters) {
                    klasaTest();

                fuel = liters >= 0 ? (fuel + liters) < fuleCapaity ? fuel + liters : fuleCapaity : 0;
                System.out.println(fuel);

        }
        public void klasaTest(){
            System.out.println(" Tylko pis ");
        }


    }

}
