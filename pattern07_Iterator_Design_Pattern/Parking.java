package src.design00_Patterns.pattern07_Iterator_Design_Pattern;

import java.util.ArrayList;

public class Parking {
    ArrayList<Vehicle> vehicles;

    public Parking() {
        vehicles=new ArrayList<>();
    }

    public void add(Vehicle v){
        vehicles.add(v);
    }

    public ArrayList<Vehicle> getAll(){
        return vehicles;
    }

    public Iterator createIterator(){
        return new VehicleIterator(this.getAll());
    }
}
