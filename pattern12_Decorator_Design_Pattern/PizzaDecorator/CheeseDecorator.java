package src.design00_Patterns.pattern12_Decorator_Design_Pattern.PizzaDecorator;

import src.design00_Patterns.pattern12_Decorator_Design_Pattern.Pizza;

public class CheeseDecorator extends  Decorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription()+"Cheese Toppings";
    }

    @Override
    public int getCost() {
        return this.pizza.getCost()+50;
    }
}
