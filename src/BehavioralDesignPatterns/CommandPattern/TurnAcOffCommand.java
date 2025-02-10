package BehavioralDesignPatterns.CommandPattern;

public class TurnAcOffCommand implements Icommand{
    AirConditioner airConditioner;

    public TurnAcOffCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }


    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo() {
        airConditioner.turnOnAc();
    }
}
