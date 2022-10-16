package myJavaStart;

public class ShowClient {

    void schowClient(Client client, double discountPrice, double price) {
        welcome(client);
        schowPrice(discountPrice, price);
    }

    private void welcome(Client client) {
        if (client.getFirstname() != null && client.getLastnam() != null) {

            System.out.println("Witaj " + client.getFirstname() + " " + client.getLastnam());

        } else if (client.getFirstname() == null && client.getLastnam() == null) {

            System.out.println("Witaj nieznajomy");

        } else if (client.getFirstname() == null) {

            System.out.printf("%s, %s\n", "Dzien dobry panie/pani ", client.getLastnam());

        } else if (client.getLastnam() == null) {

            System.out.printf("%s, %s\n", "Witaj ", client.getFirstname());

        }
    }

    private void schowPrice(double discountPrice, double price) {

        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + discountPrice);
    }
}

