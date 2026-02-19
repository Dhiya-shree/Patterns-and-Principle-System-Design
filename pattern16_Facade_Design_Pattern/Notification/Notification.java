package src.design00_Patterns.pattern16_Facade_Design_Pattern.Notification;

public class Notification implements  iNotify{

    public  void sendNotify(String msg){
        System.out.println(" Notification sent success : "+msg);
    }
}
