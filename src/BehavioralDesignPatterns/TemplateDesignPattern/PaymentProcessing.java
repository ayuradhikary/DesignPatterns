package BehavioralDesignPatterns.TemplateDesignPattern;

public abstract class PaymentProcessing {
    public abstract void validateRequest();
    public abstract void calculateCharge();
    public abstract void makeDebit();
    public abstract void makeCredit();

    // templateMethod (algorithm to make payment)
    public void makePayment(){
        validateRequest();
        calculateCharge();
        makeDebit();
        makeCredit();
    }

}
