package src.design00_Patterns.pattern12_Decorator_Design_Pattern;

public class BasePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Base Pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
