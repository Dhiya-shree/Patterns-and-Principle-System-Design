package src.design00_Patterns.pattern09_Mediator_Design_Pattern;

public interface Mediator {

    void addColleague(Colleague colleague);
    void removeColleague(Colleague colleague);
    void sendNotificationToAll(String message,Colleague c);
    void sendNotification(String message,Colleague colleague1,Colleague c2);
    void doAction(String amount,Colleague id);
    void getAllNotifications();
    void getSpecifiedNotification(Colleague c);
}
