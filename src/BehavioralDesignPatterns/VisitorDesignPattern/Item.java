package BehavioralDesignPatterns.VisitorDesignPattern;

public interface Item {
    void accept(Visitor visitor);
}
