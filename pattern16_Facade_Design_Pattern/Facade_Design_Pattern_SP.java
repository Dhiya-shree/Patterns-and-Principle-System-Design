package src.design00_Patterns.pattern16_Facade_Design_Pattern;

/**
 *
 * Facade Design Pattern
 *
 * Structural Design Pattern
 *
 * Facade - provides easy to use interface for complex system with multiple sub-system
 *
 *    Client-----> FacadeClass
 *                 objA<>------------ClassA
 *                 objB<>------------ClassB
 *                 objC<>------------ClassC
 *                 objN<>------------ClassN
 *                 methods()
 *
 */
public class Facade_Design_Pattern_SP {
    public static void main(String[] args) {

        BalanceFacade bf=new BalanceFacade();
        bf.checkStatement();
        bf.addBalance(5000,"Salary",1234);
        bf.checkStatement();
        bf.deductBalance(1450,"Purchase",1234);
        bf.checkStatement();
    }
}
