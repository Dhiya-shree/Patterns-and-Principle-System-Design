package src.design00_Patterns.pattern02_State_Design;

// State Design Pattern - Behavioural Design Pattern

/**
 *  Based on the state on any object at runtime
 *  Interface is used to determine implementing method
 *  -------
 *  TV ON - Power button : OFF
 *  TV OFF - Power button : ON
 *  Based on state of TV , Power button works as interface to set the method
 *
 */
public class StateDesignPattern_BP {

    public static void main(String[] args) {
        Object_Phone phone=new Object_Phone(new OffPhoneState());// Current state OFF
        phone.powerButton();
        phone.powerButton();
        phone.powerButton();
        phone.powerButton();
        phone.powerButton();
        phone.powerButton();
    }
}
