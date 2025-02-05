package StructuralDesignPatterns.BridgeDesignPattern.Example2;

public class Bike extends Vehicle{

    public Bike(Workshop workshopOne, Workshop workshopTwo){
        super(workshopOne, workshopTwo);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike");
        workshopOne.work();
        workshopTwo.work();
    }
}
