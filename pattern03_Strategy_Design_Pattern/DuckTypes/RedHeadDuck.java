package src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes;

import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.FlyingStrategyPkg.FlapFly;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.QuackStrategyPkg.QuackQuack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        super(new FlapFly(), new QuackQuack());
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
