package src.design00_Patterns.pattern15_Proxy_Design_Pattern;

public class RealImage implements Image{

    private final String fileName;
    public RealImage(String fileName) {
        this.fileName=fileName;
        loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println(" Loading images from directory......");
    }

    @Override
    public void display() {
        System.out.println(" Display real image"+this.fileName);
    }
}
