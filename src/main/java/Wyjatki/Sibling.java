package Wyjatki;

import java.io.File;

class Sibling {
    public static void main(String[] args) {
        File f1 = new File("dir/myfile1.txt");
        File f2 = new File("dir/myfile2.txt");
        System.out.println( areSiblings(f1 ,  f2));
        System.out.println(f2.getParent().equals(f1.getParent())) ;

    }


    public static boolean areSiblings(File f1, File f2) {


        System.out.println("jestem");
        return f1.equals(f2);
    }
}