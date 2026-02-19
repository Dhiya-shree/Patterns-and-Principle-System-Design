package src.design00_Patterns.pattern05_Template_Design_Pattern;

/**
 *
 * Template Design Pattern :
 *
 * Behavioral Pattern
 *
 * Here Template -> Abstract class with some final methods
 *           Template's abstract and final methods makes sure class extending template follow those methods
 *  Template -> Abstract class
 *      Final methods -> methods that can not be overridden by child class
 *      abstract/normal methods -> Child class can override
 *
 *  Extending_class extends Template:
 *  Use Final method as it is
 *  Give implementation for abstract methods
 *
 *  Ex:
 *  Template :
 *  final void doThis(){ sout" Must be only this" }
 *
 *  class A extends Template {
 *      Can not override template's do this ;
 *      Must follow as per template ;
 *  }
 *
 */
public class Template_Design_Pattern_BP {

    public static void main(String[] args) {
             Template t=new PathA();
             t.stepsToDo();
             PathB b =new PathB();
             b.stepsToDo();
             PathC c=new PathC();
             c.stepsToDo();
             c.additionalMethod();

    }
}
