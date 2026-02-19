package src.design00_Patterns.pattern13_Adapter_Design_Pattern.SimilarCard;

import src.design00_Patterns.pattern13_Adapter_Design_Pattern.Document;

public class VoterId implements Document {
    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public VoterId(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getIdentificationNumber() {
        return this.id;
    }
}
