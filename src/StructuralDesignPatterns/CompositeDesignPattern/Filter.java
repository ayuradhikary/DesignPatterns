package StructuralDesignPatterns.CompositeDesignPattern;

public class Filter implements CigaretteComponent{
    @Override
    public void create() {
        System.out.println("Adding filter to the cigarettee");
    }
}
