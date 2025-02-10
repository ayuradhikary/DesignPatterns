package BehavioralDesignPatterns.ChainofResponsibilityPattern;

public class ChainOfResponsibityImplementation {
    public static void main(String[] args) {
        PaymentHandler esewa = new EsewaPaymentHandler();
        PaymentHandler creditcard = new CreditCardPaymentHandler();
        PaymentHandler orangenxt = new OrangeNxtPaymentHandler();

        esewa.setNext(creditcard);
        creditcard.setNext(orangenxt);

        esewa.handlePayment(1000);
        esewa.handlePayment(200);
        esewa.handlePayment(2000);
    }
}
