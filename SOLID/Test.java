package SOLID;

public class Test {
    public static void main(String[] args) {
        Order order = new OrderAction();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // Invoice generation and email notification are optional
        if (order instanceof InvoiceGenerator) {
            ((InvoiceGenerator) order).generateInvoice("order_123.pdf");
        }

        if (order instanceof EmailNotifier) {
            ((EmailNotifier) order).sendEmailNotification("johndoe@example.com");
        }
    }
}
