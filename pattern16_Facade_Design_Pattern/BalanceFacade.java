package src.design00_Patterns.pattern16_Facade_Design_Pattern;

import src.design00_Patterns.pattern16_Facade_Design_Pattern.Balance.Balance;
import src.design00_Patterns.pattern16_Facade_Design_Pattern.Balance.iBalance;
import src.design00_Patterns.pattern16_Facade_Design_Pattern.Ledger.Ledger;
import src.design00_Patterns.pattern16_Facade_Design_Pattern.Ledger.iLedger;
import src.design00_Patterns.pattern16_Facade_Design_Pattern.Notification.Notification;
import src.design00_Patterns.pattern16_Facade_Design_Pattern.Notification.iNotify;
import src.design00_Patterns.pattern16_Facade_Design_Pattern.Security.Security;
import src.design00_Patterns.pattern16_Facade_Design_Pattern.Security.iSecure;
public class BalanceFacade {
    private iBalance balance;
    private iLedger ledger;
    private iNotify notify;
    private iSecure secure;

    public BalanceFacade() {

        this.balance = new Balance();
        this.ledger = new Ledger();
        this.notify = new Notification();
        this.secure = new Security(1234);
    }

    public void checkStatement(){
        balance.checkBalance();
        ledger.displayLedger();
    }


    public void addBalance(int a,String reason,int pin){
        if(!secure.verify(pin)){
            System.out.println(" Incorrect pin ");
            return;
        }
        balance.addBalance(a);
        ledger.putEntry(a,reason,false);
        notify.sendNotify("Amount "+a+" credited successfully ");
    }

    public void deductBalance(int a,String reason,int pin){
        if(!secure.verify(pin)){
            System.out.println(" Incorrect pin ");
            return;
        }
        balance.deductBalance(a);
        ledger.putEntry(a,reason,true);
        notify.sendNotify("Amount "+a+" debited successfully ");
    }

}
