package BehavioralDesignPatterns.MementoDesignPattern;

public class CareTaker {
    private Memento memento;

    public void saveMemento(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }

}
