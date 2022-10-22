package myJavaStart.loops.Szpital;

public class Hospital {
    //klasa z logiką aplikacji umożliwiająca dopisanie pacjenta do kolejki oraz wyświetlenie wszystkich zapisanych pacjentów,


    private static int addedPaitient = 0;
    private final  int maxPatient = 10;
    private  Patient[] patients = new Patient[maxPatient];
    //   private static int numPatient;

    void addPatient(Patient patient) {

        if (addedPaitient < maxPatient) {

            patients[addedPaitient] = patient;
            addedPaitient++;
        }
        else
            System.out.println("Brak miejsca na dzisiaj przepraszamy");

    }
    void showAddPatient() {

 for (int i = 0; i < addedPaitient; i++){
     System.out.println(patients[i].getFirstname() + " " + patients[i].getLastname() + " " +patients[i].getPESEL());

 }
    }


}
