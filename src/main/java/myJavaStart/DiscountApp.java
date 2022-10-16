package myJavaStart;

public class DiscountApp {
    public static void main(String[] args) {
        double price = 1100;
        double price1 = 900;
        Client cilent0 = new Client("JAcek", "Grzybowski", true);
        Client cilent1 = new Client(null, null, false);

        DiscountService disc0 = new DiscountService();
        double discountPrice = disc0.calculateDiscountPrice(cilent0, price);
        double discountPrice1 = disc0.calculateDiscountPrice(cilent1, price1);
        ShowClient schow = new ShowClient();
        schow.schowClient(cilent0, discountPrice, price);
        schow.schowClient(cilent1, discountPrice1, price1);
    }
}
