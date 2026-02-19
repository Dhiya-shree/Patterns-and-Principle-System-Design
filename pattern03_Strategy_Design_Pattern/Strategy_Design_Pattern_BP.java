package src.design00_Patterns.pattern03_Strategy_Design_Pattern;

// Strategy Design Pattern

import src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes.BlackNeckDuck;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes.MallardDuck;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes.Duck;
import src.design00_Patterns.pattern03_Strategy_Design_Pattern.DuckTypes.RedHeadDuck;

/**
 *
 * When we need to use more than 1 strategy/algorithm for a same function
 *       Use STRATEGY DESIGN PATTERN
 *
 * Strategy design pattern :
 *    Class Parent ( func a ) <-- ChildA,ChildB,ChildC......ChildTypeN
 *    If A-H - func a print circle
 *       I-P - func a print square
 *       Q-z - func a print triangle
 *
 *   Need to override same code , same implementation in all child classes
 *   i.e. if parent func a -> implement circle
 *        then all child classes I-P -> override func a with square strategy
 *        all child classes from Q-z -> override func a with triangle
 *
 *  INSTEAD.........
 *  use INTERFACE ... for implementing diff strategy
 *
 *      Parent A
 *      {
 *      FuncStrategy   ------------------------------->  FuncStrategy Interface
 *      func(){                                              func()
 *          this.FunStrategy.func();                        ^     ^
 *      }                                                   |    |
 *      }                                             Strat1     Strat2
 *
 *
 */
public class Strategy_Design_Pattern_BP {

    public static void main(String[] args) {

        Duck duck1=new MallardDuck();
        duck1.fly();duck1.quack();
        Duck duck2=new RedHeadDuck();
        duck2.fly();duck2.quack();
        Duck duck3=new BlackNeckDuck();
        duck3.fly();duck3.quack();

    }
}
