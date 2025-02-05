package StructuralDesignPatterns.BridgeDesignPattern;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Assemble implements Manufacture{

    @Override
    public void work() {
        System.out.println("And");
        System.out.println("Assembeled.");
    }
}
