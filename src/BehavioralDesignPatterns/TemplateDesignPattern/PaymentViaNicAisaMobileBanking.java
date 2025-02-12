package BehavioralDesignPatterns.TemplateDesignPattern;

public class PaymentViaNicAisaMobileBanking extends PaymentProcessing{

    @Override
    public void validateRequest() {
        System.out.println("request has been validated");
    }

    @Override
    public void calculateCharge() {
        System.out.println("5% of the total transaction amount has been deducted");
    }

    @Override
    public void makeDebit() {
        System.out.println("account has been debited");
    }

    @Override
    public void makeCredit() {
        System.out.println("account has been credited");
    }
}
