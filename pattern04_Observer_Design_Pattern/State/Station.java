package src.design00_Patterns.pattern04_Observer_Design_Pattern.State;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers.iObserver;

import java.util.HashSet;
import java.util.Objects;

public class Station {
    HashSet<iObserver> observers;
    public void notifyObserver(ObjectData object){
        // For future purposes use CompleteFuture
        for(iObserver observer:observers) {
            observer.update(object);
        }
    };

   public  void notifyObserver(){
        // For future purposes use CompleteFuture
        for(iObserver observer:observers) {
            observer.update();
        }
    };

    public void subscribe(iObserver observer){
        observers.add(observer);
    };

    public void unSubscribe(iObserver observer){
        observers.remove(observer);
    };
}
