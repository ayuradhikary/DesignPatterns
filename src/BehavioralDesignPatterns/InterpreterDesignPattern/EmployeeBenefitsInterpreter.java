package BehavioralDesignPatterns.InterpreterDesignPattern;

public class EmployeeBenefitsInterpreter {
    //Non-terminal expression as it uses multiple terminal expression
    //and apply further rules

    public void benefitsEligibility(Employee employee){
        HealthCareRule healthCareRule = new HealthCareRule();
        RetirementBonusRule retirementBonusRule = new RetirementBonusRule();

        if(healthCareRule.evaluate(employee)){
            System.out.println("Eligilble for Health care policy");
        }else{
            System.out.println("not eligible for Health care policy");
        }

        if(retirementBonusRule.evaluate(employee)){
            System.out.println("eligible for retirement bonus");
        }else {
            System.out.println("not eligible for retirement bonus");
        }
    }


}
