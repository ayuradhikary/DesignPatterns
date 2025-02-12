package BehavioralDesignPatterns.StrategyDesignPattern;

public class OffRoadDrive implements Drivable {
    @Override
    public void drive() {
        System.out.println("Off road features like off road suspensions are added");
    }
}
