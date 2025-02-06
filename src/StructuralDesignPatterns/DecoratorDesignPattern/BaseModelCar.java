package StructuralDesignPatterns.DecoratorDesignPattern;

public class BaseModelCar implements Car {
    @Override
    public double cost() {
        return 1500000;
    }

    @Override
    public String description() {
        return "The base model of the car";
    }
}
