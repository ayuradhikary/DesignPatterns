package StructuralDesignPatterns.FacadeDesignPattern.ExampleOne;

public class EmployeeDAO {
    public void insert(){
        //insert into database
    }

    public void UpdateEmployeeName(){
        //update employee name
    }

    public Employee getEmployeeDetails(int empId){
        return new Employee();
    }

    public Employee getEmployeeDetails(String emailID){
        return new Employee();
    }
}
