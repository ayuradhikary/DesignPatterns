package BehavioralDesignPatterns.VisitorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart(){
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void applyDiscount(Visitor discountvisitor){
        for(Item item: items){
            item.accept(discountvisitor);
        }
    }

    public void applyTax(Visitor taxVisitor){
        for(Item item: items){
            item.accept(taxVisitor);
        }
    }

}
