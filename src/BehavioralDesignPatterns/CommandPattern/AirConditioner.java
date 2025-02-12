package BehavioralDesignPatterns.CommandPattern;

public class AirConditioner {
    boolean isOn;

    public void turnOnAc(){
        isOn = true;
        System.out.println("Ac is on");
    }

    public void turnOffAc(){
        isOn = false;
        System.out.println("Ac is Off");
    }
}
