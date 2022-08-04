package Wyjatki;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class WycinanieSpacji  {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine().trim();
        System.out.println(text.isEmpty() ? 0 : text.split("\\s+").length);
        reader.close();

    }
}

/* innny przykład



    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String trim = input.trim();
        reader.close();

        if (trim.isEmpty()) {
            System.out.print(0);
        } else {
            String[] inputArray = trim.split("\\s+");
            System.out.print(inputArray.length);
        }
    }
}
 */