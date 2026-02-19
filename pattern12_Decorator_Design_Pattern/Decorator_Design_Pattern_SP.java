package src.design00_Patterns.pattern12_Decorator_Design_Pattern;

import src.design00_Patterns.pattern12_Decorator_Design_Pattern.PizzaDecorator.CapsiDecorator;
import src.design00_Patterns.pattern12_Decorator_Design_Pattern.PizzaDecorator.PanneerDecorator;

/**
 *
 * DECORATOR DESIGN PATTERN
 *
 * STRUCTURAL DESIGN PATTERN
 *
 *
 *
 * Todo: Decorator vs Builder Pattern
 *
 * Builder -> Change parameters of the object / Attributes / Compile time
 * Decorator -> Change behavior of the object / Behavior / Run time changes
 *
 * Ex1:
 * Pizza Base - Can have 5 diff toppings
 * i.e) 2*5= 32
 * Thus diff classes is needed ....
 *                        BasePizza
 *           |        |              |             |              |             |   ||||||| 32 types
 *      PaneerPizza  CapsicumPizza  MushroomPizza  Panneer+Capci  Panneer+Mush  Panner+Mushroom+Capsi.....
 *
 *
 * For Pizza : Need 32 extending class
 * + For adding any topic 6 toppings = 64 classes needed
 *
 * Using Decorator
 *               ____Pizza____
 *              /             \
 *      BasePizza             Decorator( Pizza obj)
 *                         /            |        \    \    \    \
 *                 Decorator1  Decorator2  Decorator3  D4   D5   D6
 *
 * All the Decorators will have the base class , thus can change the Base class as needed
 * Instead of 64 class , only 6 for 6 toppings
 *
 *
 * Ex2: Library
 *    MVC
 *    Controller --> Service --> Repository
 *    Logging of request and response for every component
 *    In such cases , Decorator can be used for logging many controller,service etc
 *
 *
 */
public class Decorator_Design_Pattern_SP {

    public static void main(String[] args) {
        Pizza pizza=new BasePizza();
        System.out.println(" Pizza1 "+pizza.getDescription()+" "+pizza.getCost());
        pizza=new PanneerDecorator(pizza);
        pizza=new CapsiDecorator(pizza);

        System.out.println(" Pizza1 "+pizza.getDescription()+" "+pizza.getCost());


    }
}
