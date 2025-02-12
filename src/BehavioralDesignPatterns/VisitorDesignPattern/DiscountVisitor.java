package BehavioralDesignPatterns.VisitorDesignPattern;

public class DiscountVisitor implements Visitor{
    @Override
    public void visit(Book book) {
        double discount = book.getPrice()*0.10;
        double priceAfterDiscount = book.getPrice() - discount;
        System.out.println("10 percent discount has been applied, price after discount: "+priceAfterDiscount);
    }

    @Override
    public void visit(Clothing clothing) {
        double discount = clothing.getPrice()*0.20;
        double priceAfterDiscount = clothing.getPrice() - discount;
        System.out.println("20 percent discount has been applied, price after discount: "+priceAfterDiscount);
    }
}
