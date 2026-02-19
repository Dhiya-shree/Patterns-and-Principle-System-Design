package src.design00_Patterns.pattern01_ChainofResponsibility.Example2_Logger;

public class InfoLogProcessor extends LogProcessor {
    public InfoLogProcessor(LogProcessor n) {
        super(n);
    }

    @Override
    public void log(String level, String msg) {
        if(level.equalsIgnoreCase(String.valueOf(LogType.INFO))){
            System.out.println(" Info ::::  "+msg);
        }
        else{
            super.log(level,msg);
        }
    }
}
