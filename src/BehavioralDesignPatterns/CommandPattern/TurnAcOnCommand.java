package BehavioralDesignPatterns.CommandPattern;

public class TurnAcOnCommand implements Icommand{
    AirConditioner airConditioner;

    public TurnAcOnCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOnAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOffAc();
    }
}
