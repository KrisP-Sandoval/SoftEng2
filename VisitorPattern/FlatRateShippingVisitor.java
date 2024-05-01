package VisitorPattern;

public class FlatRateShippingVisitor implements ShippingCostVisitor {
    @Override
    public void visitChair(Chair chair) {
        chair.setShippingCost(10);
    }

    @Override
    public void visitTable(Table table) {
        table.setShippingCost(15);
    }

    @Override
    public void visitSofa(Sofa sofa) {
        sofa.setShippingCost(20);
    }
}
