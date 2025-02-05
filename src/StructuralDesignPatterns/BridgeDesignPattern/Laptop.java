package StructuralDesignPatterns.BridgeDesignPattern;

public class Laptop extends Electronic{

    public Laptop(Manufacture manufacture1, Manufacture manufacture2){
        super(manufacture1,manufacture2);
    }

    @Override
    public void manufacture() {
        System.out.println("Laptop ");
        manufacture1.work();
        manufacture2.work();
    }
}
