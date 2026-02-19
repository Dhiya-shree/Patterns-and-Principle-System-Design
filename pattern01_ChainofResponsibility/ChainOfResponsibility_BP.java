package src.design00_Patterns.pattern01_ChainofResponsibility;

// Chain of Responsibility is a behavioral pattern .

/**

Request -> Handler1 -> Handler2 -> Handler3 -> Response
Handler abstract define structure + NxtHandler

NEXT HANDLER :
 Var in handler interface
 Determines which handler to call next
 HandlerA = new HandlerA(new HandlerB)

 In Constructor next handler is passed .

 */

public class ChainOfResponsibility_BP {

    public static void main(String[] args) {

        System.out.println(" Processing ....................");
        Dispencer ATMDispenser=new Dispencer1(new Dispencer2(new Dispencer3(null)));
        ATMDispenser.process(6435);
        System.out.println(" Back in main .................");
    }

}
