package myJavaStart.Dziedziczenie.paramorfizm.enumek.ZadanieStringi;

public class DataStore {

    Computer[] werehause = new Computer[100];
    int i = 0 ;

    void add(Computer comp){
        werehause[i] = comp;
        i++;
    }

    void showComputer(){
        for (int k = 0; k < i; k++) {
            System.out.println(werehause[k].toString());
        }
    }

   void checkAvailability(Computer comp){
       for (int j = 0; j < i ; j++) {
           System.out.println(comp.equals(werehause[j]));
       }



   }

}

