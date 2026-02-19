package src.design00_Patterns.pattern09_Mediator_Design_Pattern.Colleagues;

import src.design00_Patterns.pattern09_Mediator_Design_Pattern.Colleague;
import src.design00_Patterns.pattern09_Mediator_Design_Pattern.Mediator;

public class Auction_Bidder implements Colleague {
    private final int id;
    Mediator mediator;
    private final String name;

    public Auction_Bidder(int id, Mediator mediator,String name) {
        this.id = id;
        this.mediator = mediator;
        this.name=name;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void getAllNotification() {
          mediator.getAllNotifications();
    }

    @Override
    public void sendNotification(String string, Colleague colleague) {
         mediator.sendNotification(string,this,colleague);
    }

    @Override
    public void sendNotificationAll(String string) {
         mediator.sendNotificationToAll(string,this);
    }

    public void doAction(String amount){
        mediator.doAction(amount,this);
    }

    @Override
    public void getSpecifiedNotification() {
        mediator.getSpecifiedNotification(this);
    }

}
