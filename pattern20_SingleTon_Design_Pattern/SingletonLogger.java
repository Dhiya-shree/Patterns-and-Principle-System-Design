package src.design00_Patterns.pattern20_SingleTon_Design_Pattern;

public class SingletonLogger {

    //1 Create a private static instance of the class
    private static SingletonLogger loggerInstance;

    //2 Private constructor to prevent instantiation
    private SingletonLogger(){
        System.out.println(" Creating new instance.....");
    }

    //3 public static method to provide the instance
    public static SingletonLogger getInstance(){
        if(loggerInstance==null){
            loggerInstance=new SingletonLogger();

        }
        return loggerInstance;
    }


    // Some methods and funcs for logger
    public void log(String msg){
        System.out.println(" Logging ..... "+msg);
    }



}
