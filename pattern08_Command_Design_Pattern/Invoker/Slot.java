package src.design00_Patterns.pattern08_Command_Design_Pattern.Invoker;
import src.design00_Patterns.pattern08_Command_Design_Pattern.Command.Command;
public class Slot {
    private Command onCommand,offCommand;

    public Slot(Command onCommand, Command offCommand) {
        this.onCommand = onCommand;
        this.offCommand = offCommand;
    }

    public Command getOnCommand() {
        return onCommand;
    }

    public void setOnCommand(Command onCommand) {
        this.onCommand = onCommand;
    }

    public Command getOffCommand() {
        return offCommand;
    }

    public void setOffCommand(Command offCommand) {
        this.offCommand = offCommand;
    }
}
