package src.design00_Patterns.pattern02_State_Design;

public class Object_Phone {

    private State_PhoneState phoneState;

    public Object_Phone(State_PhoneState phoneState) {
        this.phoneState = phoneState; //interface
    }

    public void powerButton() {
        this.phoneState = phoneState.pressPowerButton();
    }

}