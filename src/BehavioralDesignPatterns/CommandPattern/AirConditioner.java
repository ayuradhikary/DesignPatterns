package BehavioralDesignPatterns.CommandPattern;

public class AirConditioner {
    boolean isOn;

    public void turnOnAc(){
        System.out.println("Ac is on");
    }

    public void turnOffAc(){
        System.out.println("Ac is Off");
    }
}
