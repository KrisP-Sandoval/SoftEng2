package StrategyDemo;

public class GCash implements PaymentType{
    public String calculatePayment(){
        String output = new String();
        output += "Payment is GCash\n";
        output += "Energy for trees: 10 points";

        return output;
    }
}
