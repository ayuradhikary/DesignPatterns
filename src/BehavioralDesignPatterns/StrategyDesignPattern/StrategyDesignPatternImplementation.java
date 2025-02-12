package BehavioralDesignPatterns.StrategyDesignPattern;

import javax.swing.tree.VariableHeightLayoutCache;

public class StrategyDesignPatternImplementation {
    public static void main(String[] args) {
        NormalDrive normalDrive = new NormalDrive();
        Vehicle vehicle = new Sedan(normalDrive);
        vehicle.drive();
    }
}
