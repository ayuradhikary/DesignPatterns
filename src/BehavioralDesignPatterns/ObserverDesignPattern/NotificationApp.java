package BehavioralDesignPatterns.ObserverDesignPattern;

public class NotificationApp {
    public static void main(String[] args) {
        F1SoftInternational f1SoftInternational = new F1SoftInternational();
        Employee f1softemployee = new F1SoftEmployee();
        f1SoftInternational.addEmployee(f1softemployee);
        f1SoftInternational.setNotification("There is a holiday on wednesday 12th of FEB.");

        f1SoftInternational.setNotification("Dear employees the holiday has been canceled.");

    }
}
