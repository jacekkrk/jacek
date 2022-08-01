package Wyjatki;

import java.awt.image.WritableRaster;
import java.io.*;

public class NewUserCreator  extends WriteUser {

    public static void main(String[] args) {

        NewUserCreator a = new NewUserCreator();
        boolean user1 = a.writeNewUser("adam1" , "grzybek" , 22);
        boolean user2 = a.writeNewUser("Jacek" , "grzybek" , 22);
        boolean user3 = a.writeNewUser("GaC" , "grzybek" , 22);
        System.out.printf("User1 =  %b  User2 = %b User3 = %b \n", user1, user2, user3);
        showUser("adam");
    }
    public static void showUser(String name) {

        File fr = new File(name + ".txt");
        if (fr.exists()) {
            try {
                BufferedReader read = new BufferedReader( new FileReader(name + ".txt"));
                String readLn;
                while ((readLn = read.readLine()) != null) {
                    System.out.println(readLn);;
                }
                read.close();

            } catch (FileNotFoundException e) {

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("User is exists - " + fr.exists());


    }

}
