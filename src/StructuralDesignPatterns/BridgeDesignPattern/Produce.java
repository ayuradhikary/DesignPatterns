package StructuralDesignPatterns.BridgeDesignPattern;

public class Produce implements Manufacture{
    @Override
    public void work() {
        System.out.println(" Produced");
    }
}
