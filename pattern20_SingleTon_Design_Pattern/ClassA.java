package src.design00_Patterns.pattern20_SingleTon_Design_Pattern;

public class ClassA {
    SingletonLogger logger;
    public void A(){
      logger=SingletonLogger.getInstance();
      logger.log(" In class A");
    }
}
