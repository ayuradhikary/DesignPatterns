package BehavioralDesignPatterns.ObserverDesignPattern;


import java.io.PrintStream;

//concrete observer
public class F1SoftEmployee implements Employee{
    private String notification;

    @Override
    public void updateNotification(String notification) {
        this.notification = notification;
        displayNotification();
    }

    public void displayNotification(){
        System.out.println("Notification: "+notification);
    }
}
