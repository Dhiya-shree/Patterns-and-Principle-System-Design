package src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;

public class CurrentData implements iObserver,iDisplay{

    // Method one : Passing as ref only notify
    private ObjectData object;

    public CurrentData(ObjectData object) {
        this.object=object;
    }
    public CurrentData() {
        super();
    }

    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Data ");
        System.out.println(object.getObjectName()+" passed at "+object.getTimeStamp());
        System.out.println(" Data present :"+object.toString());
    }

    //Method two :Notify as Object
    @Override
    public void update(ObjectData object) {
        display(object);
    }

    @Override
    public void display(ObjectData object) {
        System.out.println("Current Data ");
        System.out.println(object.getObjectName()+" passed at "+object.getTimeStamp());
        // Object specific func needed for multiple objects
        System.out.println(" Data present :"+object.toString());
    }
}
