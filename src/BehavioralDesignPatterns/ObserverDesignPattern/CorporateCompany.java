package BehavioralDesignPatterns.ObserverDesignPattern;

//subject
public interface CorporateCompany {
     void addEmployee(Employee employee);
     void removeEmployee(Employee employee);
     void notifyEmployee();
}
