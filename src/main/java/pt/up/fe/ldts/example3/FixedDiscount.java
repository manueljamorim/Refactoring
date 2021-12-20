package pt.up.fe.ldts.example3;

public class FixedDiscount implements Discount{
    private final int fixed;

    public FixedDiscount(int fixed){
        this.fixed = fixed;
    }

    public double applyDiscount(double price) {
        double discountedPrice = price;
        if (fixed > 0) discountedPrice = fixed > price ? 0 : price - fixed;
        else discountedPrice = price;
        return discountedPrice;
    }
}
