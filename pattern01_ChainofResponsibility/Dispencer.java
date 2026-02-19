package src.design00_Patterns.pattern01_ChainofResponsibility;

public abstract class Dispencer {
    private Dispencer nextDispencer;

    public Dispencer(Dispencer nextDispencer){
        this.nextDispencer=nextDispencer;
        System.out.println(" Above called . Currently in Dispencer ");
    }

    public void process(Integer amount){
        if(this.nextDispencer!=null){
            this.nextDispencer.process(amount);
        }
        else{
            System.out.println(" Finish process....NOW ");
        }
     //   System.out.println(" Main dummy structure Dispencer");
    }
}
