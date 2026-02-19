package src.design00_Patterns.pattern16_Facade_Design_Pattern.Balance;

public class Balance implements  iBalance {
    private int amount;

    public Balance() {
        this.amount = 1000;
    }

    public void addBalance(int a){
        amount=amount+a;
    }


    public void deductBalance(int a){
        amount=amount-a;
    }

    public void checkBalance(){
        System.out.println(" Available balance "+amount);
    }
}
