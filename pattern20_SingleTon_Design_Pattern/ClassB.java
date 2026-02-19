package src.design00_Patterns.pattern20_SingleTon_Design_Pattern;

public class ClassB {
    SingletonLogger logger;
    public void B(){
        logger=SingletonLogger.getInstance();
        logger.log(" In class B");
    }
}
