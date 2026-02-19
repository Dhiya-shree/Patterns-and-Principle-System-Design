package src.design00_Patterns.pattern13_Adapter_Design_Pattern.RationCard_with_adapter;

import src.design00_Patterns.pattern13_Adapter_Design_Pattern.Document;

public class RationAdapter implements Document {

    private RationCard rationCard;

    public RationAdapter(RationCard rationCard) {
        this.rationCard = rationCard;
    }

    @Override
    public String getFirstName() {
        String firstName=(rationCard.getFullName().split(" "))[0];
        if(firstName==null|| firstName.isBlank()){
            firstName=rationCard.getFullName();
        }
        return firstName;
    }

    @Override
    public String getLastName() {
        String firstName=(rationCard.getFullName().split(" "))[0];
        if(firstName==null|| firstName.isBlank()){
            return " ";// no last name
        }

        String lastName=rationCard.getFullName().substring(firstName.length()).trim();
        return lastName;
    }

    @Override
    public int getAge() {
        return rationCard.getAge();
    }

    @Override
    public String getIdentificationNumber() {
        return rationCard.getNumber();
    }
}
