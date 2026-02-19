package src.design00_Patterns.pattern20_SingleTon_Design_Pattern;

public class ClassC {
    SingletonLogger logger;
    public void C(){
        logger=SingletonLogger.getInstance();
        logger.log(" In class C");
    }
}
