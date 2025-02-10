package StructuralDesignPatterns.ProxyDesignPattern;

public class ProxyPatternImplementation {
    public static void main(String[] args) {
        Loginable login = new LoginProxy("root");
        login.login("1234");
    }
}
