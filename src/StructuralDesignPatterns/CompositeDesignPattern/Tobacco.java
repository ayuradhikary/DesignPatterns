package StructuralDesignPatterns.CompositeDesignPattern;

public class Tobacco implements CigaretteComponent{
    @Override
    public void create() {
        System.out.println("Adding tobacco to the cigarettee");
    }
}
