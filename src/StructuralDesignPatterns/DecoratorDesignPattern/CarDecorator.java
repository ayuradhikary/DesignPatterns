package StructuralDesignPatterns.DecoratorDesignPattern;

abstract class CarDecorator implements Car{
    Car car;

    CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public String description(){
        return car.description();
    }

    @Override
    public double cost(){
        return car.cost();
    }
}
