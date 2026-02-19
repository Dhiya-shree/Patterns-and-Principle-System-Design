package src.design00_Patterns.pattern08_Command_Design_Pattern.Invoker;

import src.design00_Patterns.pattern08_Command_Design_Pattern.Command.Command;
import src.design00_Patterns.pattern08_Command_Design_Pattern.Command.NoCommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Remote {
    private String name;
    private List<Slot> slots;
    private Command command;
    private Stack<Command> history;


    public Remote(int noOfApplicance){
        this.slots=new ArrayList<>();
        this.history=new Stack<>();
        for(int i=0;i<noOfApplicance;i++){
            slots.add(new Slot(new NoCommand(),new NoCommand()));
        }
        command=new NoCommand();
    }

    public void setSlot(int index,Slot slot){
        this.slots.set(index,slot);
    }

    public void onPushButton(int index){
        this.history.add(this.slots.get(index).getOnCommand());
        this.slots.get(index).getOnCommand().execute();
    }

    public void offPushButton(int index){
        this.history.add(this.slots.get(index).getOffCommand());
        this.slots.get(index).getOffCommand().execute();
    }

    public void undoButton(){
        command=history.pop();
        command.undo();
    }
}
