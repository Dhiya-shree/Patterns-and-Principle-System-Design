package src.design00_Patterns.pattern14_Composite_Design_Pattern;

public class File_subtype extends FileSystem_CompositeClass{
    public String content;

    public File_subtype(int size, String name) {
        super(size, name);
        content=" ";
    }

    public int getSizeWithoutCompositeFile(){
        return size;
    }


    @Override
    boolean isDir() {
        return false;
    }

    @Override
    int getSize() {
        return size;
    }
}
