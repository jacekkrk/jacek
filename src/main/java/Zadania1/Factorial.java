package Zadania1;

public class Factorial {
    int number;
    int result;
    int i = 0;

    public void read_data(int number) {

        if (i != number) {
            result = 1 * i;
            i++;
            read_data(number);
            System.out.println(result );
        }
    }
}
