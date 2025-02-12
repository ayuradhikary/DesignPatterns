package BehavioralDesignPatterns.StrategyDesignPattern;

public class Vehicle {
    Drivable drivable;

    public Vehicle(Drivable drivable){
        this.drivable = drivable;
    }

    public void drive(){
        drivable.drive();
    }
}
