package shipGame;

import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.B;
import static javax.print.attribute.standard.MediaSizeName.C;

public class runGame {
    int battleSize = 10;
    String[] [] battleFiled = new String[battleSize] [battleSize];
    String[] menuLeft = new String[] {"A","B","C","D","E","F","G","H","I","J"};
    String[] menuUp = new String[] {"1","2","3","4","5","6","7","8","9","10"};
    Scanner addShip = new Scanner(System.in);



    public static void main(String[] args) {

    runGame play = new runGame();
    play.creatMap();
    play.wyswietlMape();
    System.out.println();
    System.out.println("Enter the coordinates of the Aircraft Carrier (5 cells):");
    play.putShip();

    }

    void creatMap() {

        for(int i = 0; i < battleFiled.length; i++) {

            for(int k = 0; k < battleFiled.length; k++) {
                battleFiled[i][k] = "~";
            }
        }
    }

    void wyswietlMape() {
        System.out.print(" ");
        for (int m = 0; m < menuUp.length; m++){
            System.out.print(menuUp[m] + " ");
        }
        System.out.println();
        for(int i = 0; i < battleFiled.length; i++) {
            System.out.print(menuLeft[i] + " ");
            for(int k = 0; k < battleFiled.length; k++) {
                System.out.print(battleFiled[i][k] + " ");

            }
            System.out.println();
        }
    }
        void putShip() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.read();
            

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        }

    }


