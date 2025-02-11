package BehavioralDesignPatterns.MementoDesignPattern;

public class Memento {
    private int value;

    public Memento(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
