package StructuralDesignPatterns.BridgeDesignPattern;

public class Mouse extends Electronic{

    public Mouse(Manufacture manufacture1, Manufacture manufacture2){
        super(manufacture1, manufacture2);
    }

    @Override
    public void manufacture() {
        System.out.println("Mouse ");
        manufacture1.work();
        manufacture2.work();
    }
}
