package src.design00_Patterns.pattern19_Factory_Design_Pattern;

import src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects.Car;
import src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects.Truck;
import src.design00_Patterns.pattern19_Factory_Design_Pattern.FactoryObjects.Vehicle;

import java.util.Scanner;

/**
 *
 * FACTORY DESIGN PATTERN
 *
 * CREATION-AL DESIGN PATTERN
 *
 * Object Creation design pattern
 *
 *
 * Factory - introduces a class for creating objects for the clients
 *
 *
 *
 *
 *
 *
 */
public class Factory_Design_Pattern_CP {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String type=sc.next().trim();
        if(type==null||type.isBlank()){
            System.out.println(" Nothing types retry !!!");
        }
        else {

            /** With Factory , client say bike ... bike created
             * Changes only needed in Factory class
             * .....
             * As it is creation-al pattern  do not f**k around else end up with Anti Pattern
             * If objects not closely related / have different constructors
             *    Think twice before using
             *
             */

            VehicleFactory vf=new VehicleFactory();
            Vehicle v=vf.createVehicle(type);
            v.display();


            /** Without Factory Design
               Need to add new vehicle Bike ?
             Then add that for every client */

            if (type.equals("Truck")) {
                v = new Truck();
                v.display();
            } else if (type.equals("Car")) {
                v = new Car(); v.display();
            } else {
                System.out.println(" Vehicle not found ");
            }


        }
    }
}
