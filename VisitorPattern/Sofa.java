package VisitorPattern;

public class Sofa implements Furniture {
    private int shippingCost;
    private int weight;
    private int distance;

    public Sofa(int weight, int distance) {
        this.weight = weight;
        this.distance = distance;
    }

    @Override
    public void accept(ShippingCostVisitor visitor) {
        visitor.visitSofa(this);
    }

    public int getWeight() {
        return weight;
    }

    public int getDistance() {
        return distance;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }
}
