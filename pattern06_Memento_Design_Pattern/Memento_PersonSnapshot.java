package src.design00_Patterns.pattern06_Memento_Design_Pattern;

public class Memento_PersonSnapshot {
    private int age;
    private int weight;

    public int getBMI() {
        return BMI;
    }

    public void setBMI(int BMI) {
        this.BMI = BMI;
    }

    private int BMI;

    public Memento_PersonSnapshot(int age, int weight, int bmi) {
        this.age = age;
        this.weight = weight;
        this.BMI = bmi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString(){

        return (this.age+" "+this.weight+" "+this.BMI);
    }
}
