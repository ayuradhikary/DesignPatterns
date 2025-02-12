package BehavioralDesignPatterns.StateDesignPattern;

public class HeatState implements ACState{
    ACRemote acRemoteControl;

    public HeatState(ACRemote acRemoteControl){
        this.acRemoteControl = acRemoteControl;
    }

    @Override
    public void pressPowerButton() {
        System.out.println("AC has been turned off.");
        acRemoteControl.setState(acRemoteControl.getOffState());
    }

    @Override
    public void pressCoolButton() {
        System.out.println("Switching to Cooling mode");
        acRemoteControl.setState(acRemoteControl.getCoolState());
    }

    @Override
    public void pressHeatButton() {
        System.out.println("AC is in the Heating mode");
    }
}
