package src.design00_Patterns.pattern15_Proxy_Design_Pattern;

public class ProxyImage implements Image{

    private final String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // checks before calling actual call
        if(!fileName.matches("^[a-zA-Z0-9]+$")){
            System.out.println(" Invalid file name ");
            return;
        }

        RealImage realImage = new RealImage(fileName);
        realImage.display();
    }
}
