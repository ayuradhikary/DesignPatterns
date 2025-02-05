package StructuralDesignPatterns.BridgeDesignPattern.Example3;

public abstract class Beverage {
    Factory factoryOne;
    Factory factoryTwo;

    public Beverage(Factory factoryOne, Factory factoryTwo){
        this.factoryOne = factoryOne;
        this.factoryTwo = factoryTwo;
    }

    public abstract void manufacture();

}
