package StructuralDesignPatterns.BridgeDesignPattern.Example2;

public class Bus extends Vehicle{

    public Bus(Workshop workshopOne, Workshop workshopTwo){
        super(workshopOne, workshopTwo);
    }

    @Override
    public void manufacture() {
        System.out.println("Bus");
        workshopOne.work();
        workshopTwo.work();
    }
}
