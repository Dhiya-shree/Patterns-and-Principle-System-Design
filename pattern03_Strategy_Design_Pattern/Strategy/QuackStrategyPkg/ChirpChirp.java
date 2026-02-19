package src.design00_Patterns.pattern03_Strategy_Design_Pattern.Strategy.QuackStrategyPkg;

public class ChirpChirp implements QuackStrategy{

    public void quack() {
        System.out.println(" Chirp Chirp ......");
    }
}
