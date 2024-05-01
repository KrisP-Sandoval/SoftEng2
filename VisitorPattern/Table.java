package VisitorPattern;

public class Table implements Furniture {
    private int shippingCost;

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitTable(this);
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }
}
