package SOLID;

public class InvoiceAction implements InvoiceGenerator {
    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating invoice in a system
        System.out.println("Invoice generated for " + fileName);
    }
}
