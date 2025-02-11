package BehavioralDesignPatterns.InterpreterDesignPattern;

public class Employee {
    private  double yearsServed;
    private boolean isFullTime;

    public Employee(double yearsServed, boolean isFullTime) {
        this.yearsServed = yearsServed;
        this.isFullTime = isFullTime;
    }

    public double getYearsServed() {
        return yearsServed;
    }

    public boolean isFullTime() {
        return isFullTime;
    }
}
