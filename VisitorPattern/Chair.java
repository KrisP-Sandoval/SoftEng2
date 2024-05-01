package VisitorPattern;

public class Chair implements Furniture {
    private int shippingCost;

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitChair(this);
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }
}
