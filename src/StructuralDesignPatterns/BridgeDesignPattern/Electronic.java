package StructuralDesignPatterns.BridgeDesignPattern;

abstract class Electronic {
    protected  Manufacture manufacture1;
    protected  Manufacture manufacture2;

    protected Electronic(Manufacture manufacture1, Manufacture manufacture2){
        this.manufacture1 = manufacture1;
        this.manufacture2 = manufacture2;
    }

    abstract public void manufacture();
}
