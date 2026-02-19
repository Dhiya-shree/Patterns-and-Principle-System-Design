package src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;

public interface iDisplay {
    void display();

    void display(ObjectData object);
}
