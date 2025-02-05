package StructuralDesignPatterns.BridgeDesignPattern.Example3;

public class Demo {
    public static void main(String[] args) {
        Beverage beer = new Beer(new Produce(), new Pack());
        beer.manufacture();
    }
}

