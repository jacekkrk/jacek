package MyInterface;

public interface nazwaInterfejsu {


    double PI = 3.14; // to jest public static final

    void cos();  // publiczna i abstrakcyjna - ona musi zostac nadpisana w klasie ktorej implementuje interfejs !!
    // interfejs jest po to zeby wymoc na klasie
    void jazda(int spped);
    void zatrzymajSie();
}
