package src.design00_Patterns.pattern14_Composite_Design_Pattern;

public abstract class FileSystem_CompositeClass {
    private String name;
    public int size;

   public String getName(){
        return name;
    }
    public FileSystem_CompositeClass(int size, String name) {
        this.size = size;
        this.name = name;
    }

    void rename(String newName){
        this.name=newName;
    }
    abstract  boolean isDir();
    abstract int getSize();
}
