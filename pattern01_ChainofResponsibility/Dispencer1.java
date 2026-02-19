package src.design00_Patterns.pattern01_ChainofResponsibility;

public class Dispencer1 extends Dispencer{

    public Dispencer1(Dispencer nextDispencer){
        super(nextDispencer);
        System.out.println("In Dispencer 1 .. called above .");
    }

    @Override
    public void process(Integer amount) {

        if(amount<0){
            System.out.println("zero Thousand ");
        }

        int notes=amount/1000;
        int rem=amount%1000;
        System.out.println(" Thousand notes "+notes);
        super.process(rem);
        System.out.println(" Functions completed in Thousand");
    }
}
