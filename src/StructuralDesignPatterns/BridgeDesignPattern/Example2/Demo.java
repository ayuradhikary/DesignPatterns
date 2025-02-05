package StructuralDesignPatterns.BridgeDesignPattern.Example2;

public class Demo {
    public static void main(String[] args) {
        Produce p1 = new Produce();
        Assemble a1 = new Assemble();
        Vehicle bike = new Bike(p1,a1);
        bike.manufacture();

        Produce p2 = new Produce();
        Assemble a2 = new Assemble();
        Vehicle bus = new Bus(p2,a2);
        bus.manufacture();

    }
}
