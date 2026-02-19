package src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;

public class Statistics implements iObserver,iDisplay{

    // Method one : Passing as ref only notify
    private ObjectData object;

    public Statistics(ObjectData object) {
        this.object=object;
    }
    public Statistics() {
        super();
    }

    @Override
    public void update() {
        display();
    }
    @Override
    public void display() {
        System.out.println("Statistics Data ");
        object.graph();
    }

    //Method two :Notify as Object
    @Override
    public void update(ObjectData object) {
        display(object);
    }

    @Override
    public void display(ObjectData object) {
        System.out.println("Statistics Data ");
        object.graph();
        // Object specific func needed for multiple objects
    }
}
