package src.design00_Patterns.pattern13_Adapter_Design_Pattern;

public class Client {
    Document document;

    public void getDocument() {
        System.out.println(" Name "+document.getFirstName()+" "+document.getLastName()+" age :"+document.getAge());
        System.out.println(" Number : "+document.getIdentificationNumber());
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
