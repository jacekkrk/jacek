import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] dane = new String[3];
        for (int a = 0 ; a < dane.length; a ++ ) {
            dane [a] = scanner.nextLine();
        }
        for (int a = dane.length ; a > 0; a -- ) {
            System.out.println(dane[a-1]);
        }

    }
}