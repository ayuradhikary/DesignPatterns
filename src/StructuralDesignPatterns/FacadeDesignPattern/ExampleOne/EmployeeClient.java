package StructuralDesignPatterns.FacadeDesignPattern.ExampleOne;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.insert();
        Employee employeeDetails = employeeFacade.getEmployeeDetails(123);
    }
}
