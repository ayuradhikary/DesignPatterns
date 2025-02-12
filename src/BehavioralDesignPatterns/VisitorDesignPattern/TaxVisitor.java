package BehavioralDesignPatterns.VisitorDesignPattern;

public class TaxVisitor implements Visitor{

    @Override
    public void visit(Book book) {
        double taxamount = book.getPrice()*0.20;
        double priceaftertax = book.getPrice() + taxamount;
        System.out.println("Price after tax addition: "+priceaftertax);
    }

    @Override
    public void visit(Clothing clothing) {
        double taxamount = clothing.getPrice()*0.20;
        double priceaftertax = clothing.getPrice() + taxamount;
        System.out.println("Price after tax addition: "+priceaftertax);
    }
}
