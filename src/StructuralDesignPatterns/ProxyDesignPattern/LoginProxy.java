package StructuralDesignPatterns.ProxyDesignPattern;

public class LoginProxy implements Loginable{
    private Computer computer;
    String username;

    public LoginProxy(String username){
        this.username = username;
    }

    @Override
    public void login(String password) {
        if(username.equalsIgnoreCase("root") && password.equalsIgnoreCase("1234")){
            computer = new Computer(username);
            computer.login("1234");
        }else {
            System.out.println("unauthorized access");
        }
    }
}
