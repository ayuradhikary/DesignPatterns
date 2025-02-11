package BehavioralDesignPatterns.MementoDesignPattern;

import org.w3c.dom.css.Counter;

public class MementoDesignPatternImplementation {
    public static void main(String[] args) {
        CounterOriginator counter = new CounterOriginator(1);
        CareTaker careTaker = new CareTaker();
        careTaker.saveMemento(counter.saveStateToMomento());
        System.out.println("counter before increment: "+counter.getValue());

        counter.increment();
        counter.increment();

        System.out.println("counter after increment: "+counter.getValue());

        //restoration

        counter.restoreStateFromMemento(careTaker.getMemento());
        System.out.println("counter after undo: "+counter.getValue());



    }
}
