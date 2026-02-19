package src.design00_Patterns.pattern07_Iterator_Design_Pattern;

import java.util.List;

public class VehicleIterator implements Iterator{
    public VehicleIterator(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    List<Vehicle> vehicles;
    int index;


    @Override
    public boolean hasNext() {
        if(vehicles.size()>=index){
            return false;
        }
        return true;
    }

    @Override
    public Vehicle next() {
        return vehicles.get(index++);
    }
}
