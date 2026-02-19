package src.design00_Patterns.pattern01_ChainofResponsibility.Example2_Logger;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor n) {
        super(n);
    }

    @Override
    public void log(String level, String msg) {
        if(level.equalsIgnoreCase(String.valueOf(LogType.DEBUG))){
            System.out.println(" Debug this ---->  "+msg);
        }
        else{
            super.log(level,msg);
        }
    }

}
