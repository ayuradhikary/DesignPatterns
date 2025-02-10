package BehavioralDesignPatterns.CommandPattern;

public class CommandPatternImplementationClient {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remoteControl = new MyRemoteControl();
        TurnAcOnCommand acOnCommand = new TurnAcOnCommand(airConditioner);
        remoteControl.setCommand(acOnCommand);
        remoteControl.pressButton();
        remoteControl.undo();

        TurnAcOffCommand turnAcOffCommand = new TurnAcOffCommand(new AirConditioner());
        remoteControl.setCommand(turnAcOffCommand);
        remoteControl.pressButton();
        remoteControl.undo();
    }
}
