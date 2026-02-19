package src.design00_Patterns.pattern16_Facade_Design_Pattern.Ledger;

public interface iLedger {
     void displayLedger();
     void putEntry(int amount , String reason, boolean debit);
}
