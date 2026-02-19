package src.design00_Patterns.pattern01_ChainofResponsibility.Example2_Logger;

public abstract class LogProcessor {
    private LogProcessor next;
    
    public LogProcessor(LogProcessor n){
        next=n;
    }

    public LogProcessor(){
        next=null;
    }

    public void log(String level,String msg){
        if(next!=null){
            this.next.log(level,msg);
        }
        else{
            System.out.println(" Logging ......: "+msg);
        }
    }
}
