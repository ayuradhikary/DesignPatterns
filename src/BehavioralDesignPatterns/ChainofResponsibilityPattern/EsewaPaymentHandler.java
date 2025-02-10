package BehavioralDesignPatterns.ChainofResponsibilityPattern;

public class EsewaPaymentHandler extends PaymentHandler{
    @Override
    public void handlePayment(double payment) {
        if(payment <= 500){
            System.out.println("handled by Esewa: Rs "+payment);
        }else{
            next.handlePayment(payment);
        }
    }
}
