package BehavioralDesignPatterns.StateDesignPattern;

public class CoolState implements ACState{

    ACRemote acRemoteConrol;

    public CoolState(ACRemote acRemoteConrol){
        this.acRemoteConrol = acRemoteConrol;
    }

    @Override
    public void pressPowerButton() {
        System.out.println("AC has been turned off.");
        acRemoteConrol.setState(acRemoteConrol.getOffState());
    }

    @Override
    public void pressCoolButton() {
        System.out.println("AC is  in cool state");
    }

    @Override
    public void pressHeatButton() {
        System.out.println("Switching to head mode");
        acRemoteConrol.setState(acRemoteConrol.getHeatState());
    }
}
