package src.design00_Patterns.pattern14_Composite_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Directory_subtype extends FileSystem_CompositeClass {
    List<FileSystem_CompositeClass> list;

    public Directory_subtype(int size, String name) {
        super(size, name);
        list=new ArrayList<>();
    }

    public void add(FileSystem_CompositeClass f){
        list.add(f);
    }


    @Override
    boolean isDir() {
        return true;
    }

    @Override
    int getSize() {
        int s=0;
        for(FileSystem_CompositeClass f:list){
            s=s+f.getSize();
        }
        return s;
    }

    int getSizeWithoutComposite() {
        int s=0;
        for(FileSystem_CompositeClass f:list){
           /** Additional Code **/
           if(f.isDir()){
               Directory_subtype d=(Directory_subtype)f;//Casting
               s=s+d.getSizeWithoutComposite();
           }
           else{
               File_subtype fs=(File_subtype) f;//Casting
               s=s+fs.getSizeWithoutCompositeFile();
           }
        }
        return s;
    }
}
