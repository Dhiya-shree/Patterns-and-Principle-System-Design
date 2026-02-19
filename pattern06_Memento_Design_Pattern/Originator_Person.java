package src.design00_Patterns.pattern06_Memento_Design_Pattern;

public class Originator_Person {
    private int age;
    private int weight;
    private int BMI;
    private int name;
    private int address;

    // CREATE MEMENTO
    public Memento_PersonSnapshot CreateMemento(){
        return new Memento_PersonSnapshot(this.age,this.weight,this.BMI);
    }

    public void RestoreMemento(Memento_PersonSnapshot memento){
        this.age=memento.getAge();
        this.weight=memento.getWeight();
        this.BMI=memento.getBMI();
    }

    public Originator_Person(int age, int weight, int BMI, int name, int address) {
        this.age = age;
        this.weight = weight;
        this.BMI = BMI;
        this.name = name;
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBMI(int BMI) {
        this.BMI = BMI;
    }

    public void setName(int name) {
        this.name = name;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
