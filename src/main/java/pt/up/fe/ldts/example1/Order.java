package pt.up.fe.ldts.example1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderLine> lines;

    public Order() {
        lines = new ArrayList<>();
    }

    public void add(Product product, int quantity) {
        lines.add(new OrderLine(product, quantity));
    }

    public double sumTotal(){
        double total = 0;

        for (OrderLine line : lines)
            total += line.getTotal();

        return total;
    }

    public boolean isElegibleForFreeDelivery() {
        return (sumTotal() > 100);
    }

    public String printOrder() {
        StringBuffer printBuffer = new StringBuffer();

        for (OrderLine line : lines)
            printBuffer.append(line.toString()+"\n");


        printBuffer.append("Total: " + sumTotal());

        return printBuffer.toString();
    }
}