package myJavaStart.Dziedziczenie.paramorfizm;

public class HospitalApp {
    public static void main(String[] args) {



        Hospital myhospital = new Hospital();
        myhospital.add( new Doctor("jan","witold",9854,1230));
        myhospital.add( new Nurse("Basia","Ketoprom",2854,12));


        myhospital.add( new Nurse("Katarzyna","Polko",2454,42));
 //       Person drhouse = (new Doctor("jan","witold",9854,1230));

 //       System.out.println(drhouse.showMe());
        myhospital.getInfo();

  //    myhospital.getInfo();


    }


}
