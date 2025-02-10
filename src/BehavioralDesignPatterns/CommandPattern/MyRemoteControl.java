package BehavioralDesignPatterns.CommandPattern;
import java.util.Stack;

public class MyRemoteControl {
    Icommand command;
    Stack<Icommand> commandHistory = new Stack<>();

    public void setCommand(Icommand command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        commandHistory.push(command);
    }

    public void undo(){
        if(!commandHistory.isEmpty()){
            Icommand lastcommand = commandHistory.pop();
            lastcommand.undo();
        }
    }
}
