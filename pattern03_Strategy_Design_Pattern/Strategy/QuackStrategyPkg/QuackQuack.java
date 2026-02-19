package src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.QuackStrategyPkg;

public class QuackQuack implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println(" Quack Quack ......");
    }
}
