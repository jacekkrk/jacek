package myJavaStart.statyczne;

public class Student {
   // pozwala przechowywać informację o imieniu, nazwisku i numerze indeksu studenta
    private String imie;
    private String nazwisko;
    private String numerIndeksu;

    static private int  liczbaStudentow;

    public Student(String imie, String nazwisko, String numerIndeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        liczbaStudentow +=1;
    }
    public Student() {

        liczbaStudentow +=1;
    }

    public static int getLiczbaStudentow() {
        return liczbaStudentow;
    }
}
