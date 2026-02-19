package src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects;

public class Vehicle {
    int wheels;
    int speed;
    int mileage;
    String name;

    public void display(){
        System.out.println(name+" : wheels->"+wheels+" speed->"+speed+" mileage->"+mileage);
    }

}
