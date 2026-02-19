package src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.FlyingStrategyPkg.FlyingStrategy;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.QuackStrategyPkg.QuackStrategy;

public class Duck {

    FlyingStrategy flyingStrategy;
    QuackStrategy quackStrategy;

    public Duck(FlyingStrategy flyingStrategy, QuackStrategy quackStrategy) {
        this.flyingStrategy = flyingStrategy;
        this.quackStrategy = quackStrategy;
    }

    public void quack(){
        this.quackStrategy.quack();
    }

    public void fly(){
        this.flyingStrategy.fly();
    }
}
