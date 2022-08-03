package bank;

import Wyjatki.FileRead;

import javax.xml.crypto.Data;
import java.io.*;

public class readProductId {
    public static void main(String[] args) {

      Data dd = new Data() {
          @Override
          public String toString() {
              return super.toString();
          }
      };

  try {

            File ff = new File("c:" + File.separator + "dir" + File.separator + "nrRachunku.txt");
            System.out.println(ff.exists());

            if (ff.exists()) {
                BufferedWriter wf = new BufferedWriter(new FileWriter("c:" + File.separator + "dir" + File.separator + "nrRachunku.txt" , true));

                wf.write("\n");
                wf.write("aaa");
                wf.close();
            }
           // BufferedReader rf = new BufferedReader( new FileReader("nrRachunku.txt"));
         //   rf.

           // if (rf == null) {
           //     FileWriter wf = new FileWriter("nrRachunku.txt");
            //}

        }



        catch (Exception e){


        }
    }


}
