package StructuralDesignPatterns.BridgeDesignPattern.Example2;

public abstract class Vehicle {
    Workshop workshopOne, workshopTwo;
    Vehicle(Workshop workshopOne,Workshop workshopTwo){
        this.workshopOne = workshopOne;
        this.workshopTwo = workshopTwo;
    }

    public abstract void manufacture();
}
