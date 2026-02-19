package src.design00_Patterns.pattern05_Template_Design_Pattern;

public class PathC extends Template{

    @Override
    void studyOOPS() {
        System.out.println(" Study Java OOPS ");
    }

    @Override
    void Book() {
        System.out.println(" Heads First Design pattern book  ");
    }

    @Override
    void ProgrammingLanguage() {
        System.out.println(" Study Java ");
    }

    void additionalMethod(){
        System.out.println(" Object of class Class C can only access , Object initialized as Parent class can not access");
    }
}
