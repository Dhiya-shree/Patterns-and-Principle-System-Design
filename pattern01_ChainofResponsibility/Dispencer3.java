package src.design00_Patterns.pattern01_ChainofResponsibility;

public class Dispencer3 extends Dispencer{
    public Dispencer3(Dispencer nextDispencer){
        super(nextDispencer);
        System.out.println("In Dispencer 3 .. called above .");
    }

    @Override
    public void process(Integer amount) {

        if(amount<0){
            System.out.println("zero Ten ");
        }

        int notes=amount/10;
        int rem=amount%10;
        System.out.println(" Ten notes "+notes);
        System.out.println(" One notes "+rem);
        super.process(amount);
        System.out.println(" Functions completed in tens");
    }
}
