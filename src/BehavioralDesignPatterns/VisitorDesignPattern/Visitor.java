package BehavioralDesignPatterns.VisitorDesignPattern;

public interface Visitor {
    void visit(Book book);
    void visit(Clothing clothing);
}
