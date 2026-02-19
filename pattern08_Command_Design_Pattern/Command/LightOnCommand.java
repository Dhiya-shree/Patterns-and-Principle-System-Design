package src.design00_Patterns.pattern08_Command_Design_Pattern.Command;

import src.design00_Patterns.pattern08_Command_Design_Pattern.Receiver.Light;

public class LightOnCommand implements Command{

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(" Execute On ");
        light.on();
    }

    @Override
    public void undo() {
        System.out.println(" Undo On = OFF");
        light.on();
    }
}