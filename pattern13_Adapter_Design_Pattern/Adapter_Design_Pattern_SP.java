package src.design00_Patterns.pattern13_Adapter_Design_Pattern;

import src.design00_Patterns.pattern13_Adapter_Design_Pattern.RationCard_with_adapter.RationAdapter;
import src.design00_Patterns.pattern13_Adapter_Design_Pattern.RationCard_with_adapter.RationCard;
import src.design00_Patterns.pattern13_Adapter_Design_Pattern.SimilarCard.DrivingLiscence;
import src.design00_Patterns.pattern13_Adapter_Design_Pattern.SimilarCard.VoterId;

/**
 *
 * ADAPTER DESIGN PATTERN
 *
 * STRUCTURAL PATTERN
 *
 * Also Called Converter design pattern
 *
 * Adapter pattern -> adapts the external values for the class
 * ex) Charge adapter , document adapter -> ration card , aadhar etc
 *
 * Adapter :
 * MUST NOT change business logic
 * CAN only adapt variables and convert
 *
 * Ex :
 *  For rationCard , it uses Adapter
 *
 *
 */
public class Adapter_Design_Pattern_SP {

    public static void main(String[] args) {

        Client c=new Client();
        Document d1=new DrivingLiscence("A","B","123",23);
        c.setDocument(d1);c.getDocument();

        Document d2=new VoterId("A","B","456",24);
        c.setDocument(d2);c.getDocument();

        // Ration card can not have changes - used by other class
        // Document class can not have changes - Open/Close Anti pattern
        //Document d1=new RationCard("A B","789",25);
        // Use DocumentAdapter
        Document d3=new RationAdapter(new RationCard("A B","789",25));
        c.setDocument(d1);c.getDocument();



    }
}
