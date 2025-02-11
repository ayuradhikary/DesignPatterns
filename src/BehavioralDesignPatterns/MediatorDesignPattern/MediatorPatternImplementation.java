package BehavioralDesignPatterns.MediatorDesignPattern;

public class MediatorPatternImplementation {
    public static void main(String[] args) {
        Manager prashanDai = new EngineeringManager();
        Employee ayur = new FoneNxtEmployee(prashanDai);
        ayur.requestLeave();
        ayur.requestPromotion();
    }
}
