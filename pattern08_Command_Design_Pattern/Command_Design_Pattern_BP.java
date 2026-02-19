package src.design00_Patterns.pattern08_Command_Design_Pattern;

import src.design00_Patterns.pattern08_Command_Design_Pattern.Command.LightOffCommand;
import src.design00_Patterns.pattern08_Command_Design_Pattern.Command.LightOnCommand;
import src.design00_Patterns.pattern08_Command_Design_Pattern.Invoker.Remote;
import src.design00_Patterns.pattern08_Command_Design_Pattern.Invoker.Slot;
import src.design00_Patterns.pattern08_Command_Design_Pattern.Receiver.Light;

/**
 *
 * Command Pattern :
 *
 * Behaviour Pattern
 *
 * Invoker -----> Command(ON/OFF/UNDO/REDO/custom)---->RECEIVER
 *
 * Command used to communicate commands from Invoker to Receiver
 * Command pattern used to undo/redo easily .
 * Memento ->save a snapshot in a list
 * Command -> save the changes/commands in a list for undo/Redo
 *
 *
 */
public class Command_Design_Pattern_BP {
    public static void main(String[] args) {
        Remote remote=new Remote(4);
        Light l1=new Light("LivingRoom");
        LightOnCommand lOn=new LightOnCommand(l1);
        LightOffCommand lOff=new LightOffCommand(l1);

        remote.setSlot(1,new Slot(lOn,lOff));
        remote.offPushButton(1);
        remote.offPushButton(1);
        remote.onPushButton(1);
        remote.undoButton();

    }
}
