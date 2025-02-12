package BehavioralDesignPatterns.TemplateDesignPattern;

public class TemplateDesignPatternImplementation {
    public static void main(String[] args) {
        PaymentViaOrangeNxt orangeNxt =  new PaymentViaOrangeNxt();
        orangeNxt.makePayment();
        System.out.println("\n");
        PaymentViaNicAisaMobileBanking nicasia = new PaymentViaNicAisaMobileBanking();
        nicasia.makePayment();
    }
}
