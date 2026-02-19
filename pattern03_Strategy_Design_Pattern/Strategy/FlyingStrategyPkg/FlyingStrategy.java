package src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.FlyingStrategyPkg;

public interface FlyingStrategy {
    default void fly(){
        System.out.println(" Fly Fly");
    };
}
