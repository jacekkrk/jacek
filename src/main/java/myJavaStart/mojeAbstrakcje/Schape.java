package myJavaStart.mojeAbstrakcje;

public interface Schape {

    double Pi = 3.14;

   double calculatePerimeter();

   double calculateArea();

   static void jestemStatyczna(){
       System.out.println("elo interfejs statyczny metoda statyczna wTF");
   }
}
