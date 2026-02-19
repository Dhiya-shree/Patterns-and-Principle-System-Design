package src.design00_Patterns.pattern06_Memento_Design_Pattern;

/**
 * Memento Design Pattern
 *
 * Behavioural Pattern
 *
 * Memento -> persisting an object's state for further use
 *             WITHOUT affecting encapsulation of Object
 * Ex :
 * Class Person -> age , height , name , address
 * Name , address -> Not change
 * Age , Height -> Changes
 *
 * In Class PersonalRecord -> need to save all the classes and need access to values
 *
 * Only some param change in Person , so no need to save all info as serialized objects
 * Instead create PersonMemento class-> age and height
 * Serialize PersonMemento and save in personalRecord
 *
 * One MUST NOT serialize the object directly :
 *      As it will restrict the encapsulation
 *      If used , the originator's method must be public to access the variables
 *
 * Memento MUST be created by Originator :
 *      If any 3 rd class is used for creation of Memento from Originator
 *      Then again Originator class needs to be accessible for 3rd class thus affecting encapsulation
 *
 * Originator -> Person class to be saved ,must create Memento.
 * Memento -> PersonMemento Snapshot of Originator with needed values
 * CareTaker -> PersonalRecord , has a list of memento
 *
 *
 */
public class Memento_Design_Pattern_BP {
    public static void main(String[] args) {
        Originator_Person O1=new Originator_Person(1,1,1,1,1);
        CareTaker_PersonalRecord record=new CareTaker_PersonalRecord();
        record.add(O1.CreateMemento());
        record.showRecord();


        System.out.println(" Changes in O1 directly ");
        O1.setAge(4);O1.setBMI(4);O1.setWeight(4);
        record.showRecord();

        System.out.println(" Adding new O2 ");
        Originator_Person O2=new Originator_Person(2,2,2,2,2);
        record.add(O2.CreateMemento());
        record.showRecord();

        System.out.println(" Restore memento");
        //Create changes
        Memento_PersonSnapshot m=new Memento_PersonSnapshot(3,3,3);
        O2.RestoreMemento(m);
        record.showRecord();


    }
}
