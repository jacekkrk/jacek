package myJavaStart;

public class DiscountService {

    public double calculateDiscountPrice(Client client, double price) {

        if (client.isClientPremium())
            return calculatePremiumDiscount(price);
        else
            return calculateStandartDiscount(price);

    }

    private double calculateStandartDiscount(double price) {

        if (price > 1000) {
            return applyDiscount(price,5);
        }

        return price;
    }

    private double calculatePremiumDiscount(double price) {
        if (price > 1000) return applyDiscount(price, 15);
        return applyDiscount(price, 10);
    }
    private double applyDiscount(double price, double discount){
        return price * (100 - discount) * 0.1;
    }
}
