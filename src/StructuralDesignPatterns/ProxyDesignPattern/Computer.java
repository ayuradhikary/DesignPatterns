package StructuralDesignPatterns.ProxyDesignPattern;

public class Computer implements Loginable{
    String username;
    public Computer(String username){
        this.username = username;
    }

    @Override
    public void login(String password) {
        System.out.println("welcome "+username);
    }
}
