package fiszkoteka;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class serwisLogic extends dataBase {

    List <String> choiced = new ArrayList<>();

  private int getRandomNumber(){

        Random rNumber = new Random();
        return rNumber.nextInt(WORDSARRAYRANGE);
    }

   String giveWord(int ang, int pl) {
        String word = "Blad 404";
       if(ang == 1 & pl == 0) word = getDataWords(getRandomNumber(), 0);
       else if (ang == 0 & pl == 1) {
           word = getDataWords(getRandomNumber(), 1);
       }

       return word ;

        }

        String checkerWords(String words){

          choiced.add(words);
          choiced.iterator();



        }



    public static void main(String[] args) {

      serwisLogic logic = new serwisLogic();
        for (int i = 0; i <5; i++) {
            System.out.println(logic.giveWord(1,1));

        }


    }
    }





