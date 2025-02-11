package BehavioralDesignPatterns.InterpreterDesignPattern;

public class InterpreterDesignPatternImplementationClient {
    public static void main(String[] args) {
        Employee seniorSoftwareEngineer = new Employee(5,true);
        EmployeeBenefitsInterpreter employeeBenefitsInterpreter = new EmployeeBenefitsInterpreter();
        employeeBenefitsInterpreter.benefitsEligibility(seniorSoftwareEngineer);

        System.out.println("\n");

        Employee associateSoftwareEngineer = new Employee(1,true);
        employeeBenefitsInterpreter.benefitsEligibility(associateSoftwareEngineer);

        System.out.println("\n");

        Employee intern = new Employee(0.2,false);
        employeeBenefitsInterpreter.benefitsEligibility(intern);
    }
}
