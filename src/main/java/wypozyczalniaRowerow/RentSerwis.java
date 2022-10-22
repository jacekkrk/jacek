package wypozyczalniaRowerow;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RentSerwis {

    List<Bike> all = new ArrayList<>();
    List<Bike> rentBike = new ArrayList<>();
    private int id = 0;

    void addBike(Bike nBike) {
        nBike.setUniqueId(id + 1);
        this.id = nBike.getUniqueId();
        all.add(nBike);

    }

    void showBike() {
        System.out.println();
        System.out.println("----------------------------------------------");
        for (int i = 0; i < all.size(); i++) {

            System.out.println(all.get(i).getType() + " " + all.get(i).getModel() +
                    " " + "id = " + all.get(i).getUniqueId());
        }
        System.out.println("----------------------------------------------");
        System.out.println();




    }
    void rentBike(int id) {

        rentBike.add(all.get(id));
        all.remove(id);



    }
    void giveBack(int id ) {





        }
    }

