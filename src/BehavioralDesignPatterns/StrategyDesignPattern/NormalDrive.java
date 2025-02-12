package BehavioralDesignPatterns.StrategyDesignPattern;

public class NormalDrive implements Drivable{
    @Override
    public void drive() {
        System.out.println("default driveable features like normal suspension are added");
    }
}
