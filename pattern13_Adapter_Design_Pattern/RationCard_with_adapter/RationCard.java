package src.design00_Patterns.pattern13_Adapter_Design_Pattern.RationCard_with_adapter;

public class RationCard {
    private String fullName;
    private String number;
    private int age;

    public RationCard(String fullName, String number, int age) {
        this.fullName = fullName;
        this.number = number;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }
}
