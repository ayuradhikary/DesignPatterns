package BehavioralDesignPatterns.InterpreterDesignPattern;

public class RetirementBonusRule implements Rule{
//terminal expression
    @Override
    public boolean evaluate(Employee employee) {
        return employee.getYearsServed() >= 5;
    }
}
