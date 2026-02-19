package src.design00_Patterns.pattern04_Observer_Design_Pattern;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.NewsData;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.WeatherData;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers.CurrentData;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers.ForeCast;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers.Statistics;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers.iObserver;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.State.WeatherStation;
import java.util.HashSet;

/**
 *
 * OBSERVER DESIGN PATTERN
 * BEHAVIORAL PATTERN
 *
 * When any change in objects needs to be notified to many observers this is used .
 *
 * 1) Pass the object to observers through Constructor
 *     So any change in object , object in observer will also have the change
 *          (   *in java objects are passed via reference)
 *     Then Notify that there is change
 *         Changed values can be observed by the object of the observer
 * State changes object -->( )  ----> iObservers
 *                                     notify()
 *                                    |   |   |
 *                                   Ob1 Ob2  Ob3
 *                                  obj  obj  obj -> objects passed in constructor
 *                                  Object passed as ref in JAVA
 *
 *
 * 2) Pass the object in the Notify method
 * State changes object -->( Object )  ----> iObservers
 *                                           notify(Object)
 *                                           |   |   |
 *                                          Ob1 Ob2  Ob3
 *
 */
public class Observer_Design_Pattern_BP {
    public static void main(String[] args) {

        //Observers
        iObserver ob1=new CurrentData();
        iObserver ob2=new ForeCast();
        iObserver ob3=new Statistics();
        HashSet<iObserver> hs=new HashSet<>();
        hs.add(ob1);hs.add(ob2);hs.add(ob3);
        WeatherStation state=new WeatherStation(hs);
        state.addObjects(new WeatherData(30,20,3));
        state.addObjects(new NewsData("Storm tomorrow",1000,200));
        state.unSubscribe(ob1);
        state.unSubscribe(ob2);
        state.unSubscribe(ob3);
        //Method1
        ObjectData dataObj=new WeatherData(30,5,5);
        iObserver ob4=new CurrentData(dataObj);
        iObserver ob5=new ForeCast((WeatherData) dataObj);
        state.subscribe(ob4);
        state.subscribe(ob5);
        state.addObjects(dataObj);
        state.viewAll();
        //modify the object shared
        ((WeatherData) dataObj).setTemperature(40);
        // Not interchangeable data
        // No SOLID
        state.Change(2,dataObj);

    }
}
