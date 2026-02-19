package src.design00_Patterns.pattern16_Facade_Design_Pattern.Security;

public class Security implements iSecure{
    private int pin;

    public Security(int pin) {
        this.pin = pin;
    }

    public boolean verify(int pin){
        return this.pin==pin;
    }
}
