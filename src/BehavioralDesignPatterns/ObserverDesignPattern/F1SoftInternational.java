package BehavioralDesignPatterns.ObserverDesignPattern;


import java.util.ArrayList;
import java.util.List;

//concrete subject
public class F1SoftInternational implements CorporateCompany{
    List<Employee> employees = new ArrayList<>();
    private String notification;

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void notifyEmployee() {
        for (Employee employee : employees){
            employee.updateNotification(notification);
        }
    }

    public void setNotification(String notification){
        this.notification = notification;
        notifyEmployee();
    }
}
