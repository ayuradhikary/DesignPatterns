package StructuralDesignPatterns.BridgeDesignPattern.Example2;

public class Assemble implements Workshop{

    @Override
    public void work(){
        System.out.println(" and assembled");
    }
}
