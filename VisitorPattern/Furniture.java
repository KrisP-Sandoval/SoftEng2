package VisitorPattern;

public interface Furniture {
    void accept(ShippingCostVisitor visitor);
}
