package StructuralDesignPatterns.BridgeDesignPattern.Example3;

public class Produce implements Factory{

    @Override
    public void work() {
        System.out.println("Produced");
    }
}
