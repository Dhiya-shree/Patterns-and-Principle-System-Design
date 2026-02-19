package src.design00_Patterns.pattern09_Mediator_Design_Pattern;

import src.design00_Patterns.pattern09_Mediator_Design_Pattern.Colleagues.Auction_Bidder;
import src.design00_Patterns.pattern09_Mediator_Design_Pattern.Mediators.Auction_Manager;

public class Mediator_Design_Pattern_BP {
    public static void main(String[] args) {

        Mediator auction=new Auction_Manager();
        Colleague c1=new Auction_Bidder(1,auction,"A");
        Colleague c2=new Auction_Bidder(2,auction,"B");
        Colleague c3=new Auction_Bidder(3,auction,"C");
        Colleague c4=new Auction_Bidder(4,auction,"D");
        auction.addColleague(c1);
        auction.addColleague(c2);
        auction.addColleague(c3);
        auction.addColleague(c4);
        c1.doAction("100");
        c2.doAction("200");
        c2.sendNotificationAll("Placed bet of 500");
        c3.doAction("600");
        c1.sendNotification("200?",c2);
        c4.sendNotification("Not 500",c3);
        c3.getSpecifiedNotification();
        c4.doAction("650");
        c2.doAction("660");
        auction.removeColleague(c2);
        c1.getAllNotification();c2.getAllNotification();c3.getAllNotification();c4.getAllNotification();


    }
}
