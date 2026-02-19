package src.design00_Patterns.pattern01_ChainofResponsibility;

public class Dispencer2 extends Dispencer{

    public Dispencer2(Dispencer nextDispencer){
        super(nextDispencer);
        System.out.println("In Dispencer 2 .. called above .");
    }

    @Override
    public void process(Integer amount) {

        if(amount<0){
            System.out.println("zero Hundred ");
        }

        int notes=amount/100;
        int rem=amount%100;
        System.out.println(" Hundred notes "+notes);
        super.process(rem);
        System.out.println(" Functions completed in Hundred");
    }
}
