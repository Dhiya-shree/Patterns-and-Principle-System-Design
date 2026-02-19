package src.design00_Patterns.pattern09_Mediator_Design_Pattern;

public interface Colleague {
    //Mediator mediator;
    int getID();
    String getName();
    void getAllNotification();
    void sendNotification(String string,Colleague colleague);
    void sendNotificationAll(String string);
    void doAction(String val);
    void getSpecifiedNotification();
}
