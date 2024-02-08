package Demo;
public class Order {
    private Double orderAmount;
    private String paymentType;

    public Order (Double orderAmount, String paymentType){
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    }

    // Three types of payment: GCash, Maya, Cash
    public String calculatePayment(){
        String output = new String();
        if (paymentType.equals("GCash")){
            output += "Payment is GCash\n";
            output += "Energy for trees: 10 points";
        } else if (paymentType.equals("Maya")){
            output += "Payment is Maya\n";
            output += "You will receive additional 1% on Savings";
        } else{
            output += "Payment is Cash\n";
            output += "No incentives";
        }

        return "Your order amount is " + orderAmount + "\n" + output;
    }
}