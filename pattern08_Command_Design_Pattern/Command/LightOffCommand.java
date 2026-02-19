package src.design00_Patterns.pattern08_Command_Design_Pattern.Command;
import  src.design00_Patterns.pattern08_Command_Design_Pattern.Receiver.Light;
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(" Execute Off ");
        light.off();
    }

    @Override
    public void undo() {
        System.out.println(" Undo Off = On ");
        light.on();
    }
}
