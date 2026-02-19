package src.design00_Patterns.pattern06_Memento_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker_PersonalRecord {
    private List<Memento_PersonSnapshot> history;
    public CareTaker_PersonalRecord(){
        this.history=new ArrayList<>();
    }

    public void add(Memento_PersonSnapshot memento){
        this.history.add(memento);
        System.out.println(" Added in history ");
    }

    public Memento_PersonSnapshot get(int id){
        return this.history.get(id);
    }

    public void showRecord(){
        for(Memento_PersonSnapshot m:history){
            System.out.println(m.toString());
        }
    }
}
