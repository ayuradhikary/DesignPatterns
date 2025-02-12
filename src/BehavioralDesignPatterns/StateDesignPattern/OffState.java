package BehavioralDesignPatterns.StateDesignPattern;

public class OffState implements ACState {
    private ACRemote acremoteControl;

    public OffState(ACRemote acremoteControl) {
        this.acremoteControl = acremoteControl;
    }

    @Override
    public void pressPowerButton() {
        System.out.println("AC turned ON.");
        acremoteControl.setState(acremoteControl.getCoolState());
    }

    @Override
    public void pressCoolButton() {
        System.out.println("AC is OFF. Power it on first.");
    }

    @Override
    public void pressHeatButton() {
        System.out.println("AC is OFF. Power it on first.");
    }
}
