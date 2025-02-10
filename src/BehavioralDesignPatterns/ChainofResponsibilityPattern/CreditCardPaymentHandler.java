package BehavioralDesignPatterns.ChainofResponsibilityPattern;

public class CreditCardPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double payment) {
        if(payment <= 1000){
            System.out.println("handled by credicard: Rs "+payment);
        }else{
            next.handlePayment(payment);
        }
    }
}
