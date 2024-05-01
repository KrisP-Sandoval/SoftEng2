package VisitorPattern;

public class Main {
    public static void main(String[] args) {
        FlatRateShippingVisitor flatRateVisitor = new FlatRateShippingVisitor();
        DistanceBasedShippingVisitor distanceBasedVisitor = new DistanceBasedShippingVisitor();

        Chair chair = new Chair();
        Table table = new Table();
        Sofa sofa = new Sofa(50, 100); // Weight in kg, distance in km

        chair.accept(flatRateVisitor);
        table.accept(flatRateVisitor);
        sofa.accept(distanceBasedVisitor);

        System.out.println("Shipping cost for chair: " + chair.getShippingCost());
        System.out.println("Shipping cost for table: " + table.getShippingCost());
        System.out.println("Shipping cost for sofa: " + sofa.getShippingCost());
    }
}
