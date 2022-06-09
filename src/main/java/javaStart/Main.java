package javaStart;

public class Main
{
    public static void main(String[] args) {


        Main main = new Main();
        main.run();


    }

    private void run() {

        //int resoult = add(ref p);
        ref rpoint = new ref();
        rpoint.x = 1;
        rpoint.y =23;
        change(rpoint);

        //System.out.println(p);
        System.out.println(rpoint.x + " " + rpoint.y);
        //System.out.println(resoult);
    }

    private int change( ref p  ){
        p = new ref();
        p.y = 99;
        p.x = 87;
return  p.x + p.y ;
    }

}
