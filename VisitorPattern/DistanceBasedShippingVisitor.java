package VisitorPattern;

public class DistanceBasedShippingVisitor implements ShippingCostVisitor {
    @Override
    public void visitChair(Chair chair) {
        chair.setShippingCost(5);
    }

    @Override
    public void visitTable(Table table) {
        table.setShippingCost(10);
    }

    @Override
    public void visitSofa(Sofa sofa) {
        // Example distance-based calculation
        sofa.setShippingCost((int) (sofa.getWeight() * sofa.getDistance() * 0.1));
    }
}
