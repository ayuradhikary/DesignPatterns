package StructuralDesignPatterns.DecoratorDesignPattern;

public class SunRoofDecorator extends CarDecorator{

    public SunRoofDecorator(Car car) {
        super(car);
    }

    @Override
    public double cost(){
        return car.cost() + 50000.0;
    }

    @Override
    public String description(){
        return car.description() + ", with sunroof";
    }
}
