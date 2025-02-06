package StructuralDesignPatterns.CompositeDesignPattern;

public class CigaretteManufacturing {
    public static void main(String[] args) {
        CigaretteComponent filter = new Filter();
        CigaretteComponent tobacco = new Tobacco();

        Cigarettee cigarettee = new Cigarettee();
        cigarettee.addComponent(tobacco);
        cigarettee.addComponent(filter);

        cigarettee.create();
    }
}
