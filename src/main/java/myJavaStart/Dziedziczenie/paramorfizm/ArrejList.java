package myJavaStart.Dziedziczenie.paramorfizm;

import java.util.*;

public class ArrejList {

    public static void main(String[] args) {


        List<String> aa = new ArrayList<>();


        aa.add("zenak");
        aa.add("kuba");
        aa.add("natka");
        aa.add("kazek");
        aa.add("ziutek");
        aa.add("mucha");
        aa.add("adam");

      ;
        Collections.sort(aa);

        System.out.println(aa);
        aa.remove(2);
        aa.add("Pis");
        Collections.sort(aa);
        System.out.println(aa);

    }
}
