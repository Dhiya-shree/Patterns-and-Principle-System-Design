package src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes;

import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.QuackStrategyPkg.ChirpChirp;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.FlyingStrategyPkg.GlideFly;

public class MallardDuck extends Duck{
    public MallardDuck() {
        super(new GlideFly(), new ChirpChirp());
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
