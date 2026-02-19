package src.design00_Patterns.pattern04_Observer_Design_Pattern.State;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers.iObserver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class WeatherStation extends Station {

   private List<ObjectData> objects;

    public WeatherStation(List<ObjectData> objects, HashSet<iObserver> observers) {
        this.observers=observers;
        this.objects = objects;
    }

    public WeatherStation( HashSet<iObserver> observers) {
        this.observers=observers;
        this.objects = new ArrayList<ObjectData>();
    }

    //Mehod 2
    public void addObjects(ObjectData object){
       objects.add(object);
       notifyObserver(object);
   }

   public  void viewAll(){
       System.out.println(" List of objects:");
        for(int i=0;i<objects.size();i++){
            System.out.println(i+" -> "+objects.get(i).getObjectName()+objects.get(i).getTimeStamp());
        }
   }
   // Testing method1
    public void Change(int id,ObjectData object){
        objects.set(id,object);
        notifyObserver();
    }
}
