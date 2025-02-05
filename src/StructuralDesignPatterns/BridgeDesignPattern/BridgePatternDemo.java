package StructuralDesignPatterns.BridgeDesignPattern;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Electronic electronic1 =  new Laptop(new Produce(), new Assemble());
        Electronic electronic2 = new Mouse(new Produce(), new Assemble());
        electronic1.manufacture();
        electronic2.manufacture();
    }
}
