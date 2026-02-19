package src.design00_Patterns.pattern01_ChainofResponsibility.Example2_Logger;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        LogProcessor logger=new InfoLogProcessor(new DebugLogProcessor(new WarnLogProcessor(new ErrorLogProcessor())));
        logger.log(String.valueOf(LogType.WARN),"This is warning msg ");
        logger.log(String.valueOf(LogType.INFO),"This is info msg ");
        logger.log(String.valueOf(LogType.ERROR),"This is error msg ");
        logger.log(String.valueOf(LogType.DEBUG),"This is debug msg ");

    }
}
