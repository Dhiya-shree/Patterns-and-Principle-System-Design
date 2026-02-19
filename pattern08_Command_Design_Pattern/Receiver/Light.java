package src.design00_Patterns.pattern08_Command_Design_Pattern.Receiver;

public class Light {
    String place;
    String state;

    public Light(String place) {
        this.place = place;
        this.state = "off";
    }

    public void on(){
        this.state="on";
    }

    public void off(){
        this.state="off";
    }

    public String getPlace(){
        return ("Light in "+this.place);
    }
}
