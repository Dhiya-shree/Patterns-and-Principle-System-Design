package src.design00_Patterns.pattern19_Factory_Design_Pattern;

import src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects.Bike;
import src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects.Car;
import src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects.Truck;
import src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects.Vehicle;

public class VehicleFactory {
   // Vehicle vehicle; Not a proxy
    // Just for object creation

    Vehicle createVehicle(String name){
        if(name.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        else if(name.equalsIgnoreCase("Car")){
           return new Car();
        }
        else if(name.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        else {
            throw new IllegalArgumentException("Unknown Vehicle Type");
        }
    }



}
