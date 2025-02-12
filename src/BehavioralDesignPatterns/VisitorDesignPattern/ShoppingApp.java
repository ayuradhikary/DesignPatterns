package BehavioralDesignPatterns.VisitorDesignPattern;

public class ShoppingApp {
    public static void main(String[] args) {
        Item book = new Book(500);
        Item clothing = new Clothing(1500);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(book);
        shoppingCart.addItem(clothing);

        Visitor discountvisitor = new DiscountVisitor();
        Visitor taxvisitor = new TaxVisitor();

        shoppingCart.applyDiscount(discountvisitor);
        shoppingCart.applyTax(taxvisitor);
    }
}
