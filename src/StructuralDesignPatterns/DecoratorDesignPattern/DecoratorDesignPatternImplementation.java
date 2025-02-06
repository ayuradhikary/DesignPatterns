package StructuralDesignPatterns.DecoratorDesignPattern;

public class DecoratorDesignPatternImplementation {
    public static void main(String[] args) {
        Car car = new BaseModelCar();
        System.out.print(car.description());
        System.out.println(", costs:"+ car.cost());

        CarDecorator decoraredCar = new SunRoofDecorator(car);
        System.out.print(decoraredCar.description());
        System.out.println(" costs: "+decoraredCar.cost());
    }
}
