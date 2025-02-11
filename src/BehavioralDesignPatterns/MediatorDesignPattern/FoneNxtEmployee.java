package BehavioralDesignPatterns.MediatorDesignPattern;

public class FoneNxtEmployee implements Employee{
    private Manager manager;

    public FoneNxtEmployee(Manager manager){
        this.manager = manager;
    }

    @Override
    public void requestLeave() {
        manager.requestLeave(this);
    }

    @Override
    public void requestPromotion() {
        manager.requestPromotion(this);
    }

    @Override
    public void notifyManager(String message) {
        System.out.println(message);
    }
}
