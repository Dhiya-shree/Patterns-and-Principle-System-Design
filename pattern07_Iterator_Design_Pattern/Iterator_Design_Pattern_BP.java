package src.design00_Patterns.pattern07_Iterator_Design_Pattern;

/**
 *
 * Iterator Design Pattern
 *
 * Behavioral Pattern
 *
 * Iterator : Class which provides functions(iterate) to iterate a set of Container
 * iterate* -> Traverse
 *
 * Iterator : Interface with methods for traversing
 * Container : Class implementing Interface with its method for iterating
 *
 * Client   -->   Iterator <-----VehicleIterator
 *      |                          |
 *      |------> Parking-----------|
 *
 * Client   -->   Iterator <-----BookIterator
 *      |                          |
 *      |------> Library-----------|
 *
 * Client   -->   Iterator <-----RecipeIterator
 *      |                          |
 *      |------> Recipes-----------|
 *
 * Ex : Iterator used for HashMap,HashSet,List,...etc
 * 
 * Above enough to know iterator and the main container 
 *
 *
 */

public class Iterator_Design_Pattern_BP {

    public static void main(String[] args) {
        Parking park=new Parking();
        park.add(new Vehicle(1));
        park.add(new Vehicle(2));
        park.add(new Vehicle(3));

        Iterator iterator= park.createIterator();
        while (iterator.hasNext()){
           Vehicle vehi=(Vehicle)iterator.next();
           System.out.println(vehi.getNumber());
            
        }

    }
}
