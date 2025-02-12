package BehavioralDesignPatterns.TemplateDesignPattern;

public class PaymentViaOrangeNxt extends PaymentProcessing{

    @Override
    public void validateRequest() {
        System.out.println("Request has been validated");
    }

    @Override
    public void makeDebit() {
        System.out.println("account debited");
    }

    @Override
    public void makeCredit() {
        System.out.println("account credited");
    }

    @Override
    public void calculateCharge() {
        System.out.println("No charges are cut while payment is made using orangeNxt");
    }
}
