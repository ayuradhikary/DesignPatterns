package StructuralDesignPatterns.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Cigarettee implements CigaretteComponent{

    private List<CigaretteComponent> components = new ArrayList<>();

    public void addComponent(CigaretteComponent component){
        components.add(component);
    }
    public void removeComponent(CigaretteComponent component){
        components.remove(component);
    }

    @Override
    public void create() {
        System.out.println("Creating cigarette");
        for(CigaretteComponent component: components){
            component.create();
        }

    }
}
