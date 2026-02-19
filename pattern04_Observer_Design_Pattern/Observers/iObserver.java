package src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;

public interface iObserver {

    void update(ObjectData object);
    void update(); //Already the observer has object currently got some changes

}
