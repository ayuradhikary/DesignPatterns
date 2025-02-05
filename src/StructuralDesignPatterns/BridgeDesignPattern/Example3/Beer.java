package StructuralDesignPatterns.BridgeDesignPattern.Example3;

public class Beer extends Beverage{

    public Beer(Factory factoryOne, Factory factoryTwo){
        super(factoryOne,factoryTwo);
    }

    @Override
    public void manufacture() {
        System.out.println("Beer");
         factoryOne.work();
         factoryTwo.work();
    }


}
