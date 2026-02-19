package src.design00_Patterns.pattern12_Decorator_Design_Pattern.PizzaDecorator;

import src.design00_Patterns.pattern12_Decorator_Design_Pattern.Pizza;

public abstract class Decorator implements Pizza {
    Pizza pizza;

    public Decorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
