package src.design00_Patterns.pattern04_Observer_Design_Pattern.Observers;

import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.ObjectData;
import src.design00_Patterns.pattern04_Observer_Design_Pattern.Objects.WeatherData;

public class ForeCast implements iObserver,iDisplay{

    // Method one : Passing as ref only notify
    private WeatherData object;

    public ForeCast(){
        object=new WeatherData();
    }

    public ForeCast(WeatherData object){
        this.object=object;
    }
    @Override
    public void update() {
        display();
    }

    @Override
    public void display() {
        System.out.println("Next Outcome....Forecast ");
        System.out.println("Next temp:"+(object.getTemperature()+1));
        System.out.println("Next wind:"+(object.getWindFlow()+1));
        System.out.println("Next humidity:"+(object.getHumidity()+1));
    }

    //Method two :Notify as Object
    @Override
    public void update(ObjectData object) {
        display(object);
    }

    @Override
    public void display(ObjectData object) {
        if(object instanceof WeatherData) {
            this.object= (WeatherData) object;
            System.out.println("Next Outcome....Forecast ");
            System.out.println("Next temp:" + (this.object.getTemperature() + 1));
            System.out.println("Next wind:" + (this.object.getWindFlow() + 1));
            System.out.println("Next humidity:" + (this.object.getHumidity() + 1));
            /**
             * With passing as object below will fail , object data needs to have additional method
             System.out.println("Next temp:" + (object.getTemperature() + 1));
             System.out.println("Next wind:" + (object.getWindFlow() + 1));
             System.out.println("Next humidity:" + (object.getHumidity() + 1));
             */
        }
        else{
            // SOLID - Anti pattern
            System.out.println(" OOPS .. no forecast for NEWS ");
        }
    }
}
