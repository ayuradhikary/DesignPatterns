package BehavioralDesignPatterns.InterpreterDesignPattern;

//only full time employee gets health care benefits
public class HealthCareRule implements Rule{

    //terminal expression
    @Override
    public boolean evaluate(Employee employee) {
        return employee.isFullTime();
    }
}
