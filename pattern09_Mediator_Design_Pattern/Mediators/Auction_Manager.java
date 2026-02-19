package src.design00_Patterns.pattern09_Mediator_Design_Pattern.Mediators;

import src.design00_Patterns.pattern09_Mediator_Design_Pattern.Colleague;
import src.design00_Patterns.pattern09_Mediator_Design_Pattern.Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Auction_Manager implements Mediator {

    List<Colleague> colleagueList;
    List<String> bidAmount;
    HashMap<Integer,List<String>> notify;
    public Auction_Manager() {
        this.colleagueList = new ArrayList<>();
        this.bidAmount = new ArrayList<>();
        notify=new HashMap<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        colleagueList.add(colleague);
    }

    @Override
    public void removeColleague(Colleague colleague) {
        colleagueList.remove(colleague);
    }


    @Override
    public void sendNotificationToAll(String message,Colleague co) {

        for(Colleague c: colleagueList){
            if(c.getID()!=co.getID()){
                sendNotification(message,co,c);
            }
        }

    }

    @Override
    public void sendNotification(String message, Colleague colleague1,Colleague colleague2) {

        if(!notify.containsKey(colleague2.getID())){
            notify.put(colleague2.getID(),new ArrayList<>());
        }

        notify.get(colleague2.getID()).add((colleague1.getID()+" - "+colleague1.getName()+" Sent : "+message));
    }

    @Override
    public void doAction(String amount,Colleague c) {
        bidAmount.add((c.getName()+" of ID "+c.getID()+" Bidded "+amount));
    }

    @Override
    public void getAllNotifications() {
             for(String s:bidAmount){
                 System.out.println(s);
             }

    }

    @Override
    public void getSpecifiedNotification(Colleague c) {
        if(!notify.containsKey(c.getID())){
            System.out.println(" No messages ");
            return;
        }
            System.out.println(" Specified messages ");

        for(String s: notify.get(c.getID())){
            System.out.println(s);
        }

    }
}
