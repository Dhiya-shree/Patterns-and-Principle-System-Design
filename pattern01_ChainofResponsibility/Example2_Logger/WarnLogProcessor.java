package src.design00_Patterns.pattern01_ChainofResponsibility.Example2_Logger;

public class WarnLogProcessor extends LogProcessor {

    public WarnLogProcessor(LogProcessor n) {
        super(n);
    }

    @Override
    public void log(String level, String msg) {
        if(level.equalsIgnoreCase(String.valueOf(LogType.WARN))){
            System.out.println(" Warning......!!!!!  "+msg);
        }
        else{
            super.log(level,msg);
        }
    }
}
