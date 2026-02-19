package src.design00_Patterns.pattern16_Facade_Design_Pattern.Ledger;

import java.util.ArrayList;
import java.util.List;

public class Ledger implements iLedger{
    List<String> list;

    public Ledger() {
        this.list = new ArrayList<>();
    }

    public void displayLedger(){
        for(String s:list){
            System.out.println(s);
        }
    }
    public void putEntry(int amount , String reason, boolean debit){
       if(debit){
           list.add((" Amount debited : "+amount+" reason :"+reason));
       }
       else{
           list.add((" Amount credited : "+amount+" reason :"+reason));
       }
    }

}
