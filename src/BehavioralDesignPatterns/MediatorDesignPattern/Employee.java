package BehavioralDesignPatterns.MediatorDesignPattern;

//Colleague
public interface Employee {
    void requestLeave();
    void requestPromotion();
    void notifyManager(String message);
}
