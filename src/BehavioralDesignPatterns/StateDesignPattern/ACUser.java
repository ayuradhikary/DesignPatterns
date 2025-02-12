package BehavioralDesignPatterns.StateDesignPattern;

public class ACUser {
    public static void main(String[] args) {
        ACRemote remote = new ACRemote();
        remote.pressPowerButton();
        remote.pressCoolButton();
        remote.pressCoolButton();
        remote.pressHeatButton();
        remote.pressHeatButton();
    }
}
