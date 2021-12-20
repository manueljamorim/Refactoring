package pt.up.fe.ldts.example3;

public class PercentageDiscount implements Discount{
    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    public double applyDiscount(double price) {
        double discountedPrice = price;
        if (percentage > 0) discountedPrice = price - price * percentage;
        else discountedPrice = price;
        return discountedPrice;
    }



}
