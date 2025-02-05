package StructuralDesignPatterns.BridgeDesignPattern.Example3;

public class Pack implements Factory{
    @Override
    public void work() {
        System.out.println(" and packed");
    }
}
