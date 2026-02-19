package src.design00_Patterns.pattern02_State_Design;

public class OnPhoneState implements State_PhoneState{
    @Override
    public State_PhoneState pressPowerButton() {
        System.out.println(" Power OFF ....");
        return new OffPhoneState();
    }
}
