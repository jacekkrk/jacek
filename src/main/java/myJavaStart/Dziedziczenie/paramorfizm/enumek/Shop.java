package myJavaStart.Dziedziczenie.paramorfizm.enumek;

import javax.sound.midi.Soundbank;

public class Shop {

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt(Size.SMOLL,Producent.NIKE);
//
//        System.out.println(tshirt.getProducent());
//        System.out.println(Producent.NIKE.getProducent());
//        System.out.println(Producent.PUMA.getProducent());
 //       System.out.println(Producent.FOURF.name());
//        System.out.println(Size.SMOLL.name());
//        System.out.println(Producent.FOURF.getId());
//        System.out.println(tshirt.getProducent().getProducent());
        Producent[] values = Producent.values();
        for (Producent value : values) {
            System.out.println(value.getId());
        }
    }
}
