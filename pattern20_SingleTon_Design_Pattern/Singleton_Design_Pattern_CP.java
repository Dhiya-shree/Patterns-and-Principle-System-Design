package src.design00_Patterns.pattern20_SingleTon_Design_Pattern;

/**
 *
 * SINGLETON DESIGN PATTERN
 *
 * CREATION-AL DESIGN PATTERN
 *
 * MUST BE THREAD SAFE
 *
 * Singleton - creates a single class for all the task and reuses the same class
 *
 * When singleton pattern is used in Thread unsafe environment
 * Because of race conditions we might end up with multiple object of class
 * Instead, of a SINGLE INSTANCE
 *
 * SINGLETON ==== Single instance === MUST BE TREAD SAFE
 *
 * Ex logger class
 *  For all user instance , all service same logger is used .
 *  Everytime new logger object is not created .
 *  Instead, existing logger object retrieved and used
 *
 */
public class Singleton_Design_Pattern_CP {
    public static void main(String[] args) {

        SingletonLogger logger=SingletonLogger.getInstance();
        logger.log("In main class ");

        ClassA a=new ClassA();a.A();
        ClassB b=new ClassB();b.B();
        ClassC c=new ClassC();c.C();


    }
}
