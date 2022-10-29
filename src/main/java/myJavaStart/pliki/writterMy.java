package myJavaStart.pliki;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class writterMy implements tworzPlik {

    public static void main(String[] args) throws FileNotFoundException {

    writterMy wr = new writterMy();

    var aa = wr.pis();
        Scanner sc = new Scanner(aa);
    String onFile = "Unknow";
    while (sc.hasNextLine())
    {
        onFile = sc.nextLine();
        System.out.println(onFile);
    }



    }


    @Override
    public File pis() {
        return tworzPlik.super.pis();
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}



