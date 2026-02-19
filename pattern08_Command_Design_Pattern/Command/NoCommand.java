package src.design00_Patterns.pattern08_Command_Design_Pattern.Command;

public class NoCommand implements Command{


    @Override
    public void execute() {
        System.out.println(" No commands for that ");
    }

    @Override
    public void undo() {
        System.out.println(" No commands for that ");
    }
}
