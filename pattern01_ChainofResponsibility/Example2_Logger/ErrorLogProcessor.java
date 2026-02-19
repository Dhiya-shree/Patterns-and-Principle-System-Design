package src.design00_Patterns.pattern01_ChainofResponsibility.Example2_Logger;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor n) {
        super(n);
    }

    public ErrorLogProcessor() {
        super();
    }

    @Override
    public void log(String level, String msg) {
        if(level.equalsIgnoreCase(String.valueOf(LogType.ERROR))){
            System.out.println(" Error ::::  "+msg);
        }
        else{
            super.log(level,msg);
        }
    }
}
