package src.design00_Patterns.pattern05_Template_Design_Pattern;

public abstract class Template {

    final void stepsToDo(){
        ProgrammingLanguage();
        studyOOPS();
        Book();
        practice();
    }

    void practice(){
        System.out.println(" Timely studies ");
    }
    abstract void studyOOPS();
    abstract void Book();
    abstract void ProgrammingLanguage();

}
