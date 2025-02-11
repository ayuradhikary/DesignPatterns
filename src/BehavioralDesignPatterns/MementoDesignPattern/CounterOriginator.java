package BehavioralDesignPatterns.MementoDesignPattern;

public class CounterOriginator {
    private int value;

    public CounterOriginator(int value){
        this.value = value;
    }

    public Memento saveStateToMomento(){
        return new Memento(value);
    }

    public void restoreStateFromMemento(Memento memento) {
        this.value = memento.getValue();
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }

}
