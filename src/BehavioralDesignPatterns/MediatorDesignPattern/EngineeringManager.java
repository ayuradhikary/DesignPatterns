package BehavioralDesignPatterns.MediatorDesignPattern;

//concrete mediator
public class EngineeringManager implements Manager{

    @Override
    public void requestLeave(Employee employee) {
        employee.notifyManager("leave request accepted");
    }

    @Override
    public void requestPromotion(Employee employee) {
        employee.notifyManager("promotion request accepted");
    }
}
