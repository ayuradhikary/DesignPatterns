package BehavioralDesignPatterns.ChainofResponsibilityPattern;

public class OrangeNxtPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double payment) {
        System.out.println("Handled by OrangeNxt: "+payment);
    }
}
