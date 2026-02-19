package src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes;

import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.FlyingStrategyPkg.GlideFly;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.QuackStrategyPkg.QuackQuack;

public class BlackNeckDuck extends Duck{

    public BlackNeckDuck() {
        super(new GlideFly(), new QuackQuack());
    }

    @Override
    public void quack() {
        System.out.println(" Child class ");
        super.quack();
    }

    @Override
    public void fly() {
        System.out.println(" Child class ");
        super.fly();
    }
}
