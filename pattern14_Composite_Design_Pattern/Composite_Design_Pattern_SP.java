package src.design00_Patterns.pattern14_Composite_Design_Pattern;


/**
 *
 * Composite Design pattern
 *
 *  structural Design pattern
 *
 * Composite - compose object into tree like structure
 *     Used mainly in Partial/Full Hierarchy
 *
 *     Client ---------- Component
 *                       |       |
 *                     Leaf      ComponentList
 *                                List<Component>
 *
 *     Main -----------FileSystem
 *                     size,name,method
 *                    |             |
 *                   File          Directory
 *                                List<FileSystem>
 *
 *
 * Example :
 *
 *    PImpl - in C++similar composite pattern
 *
 *
 */
public class Composite_Design_Pattern_SP {
    public static void main(String[] args) {

        Directory_subtype root=new Directory_subtype(4,"root");
        Directory_subtype d1=new Directory_subtype(5,"D1");
        FileSystem_CompositeClass f1=new File_subtype(3,"F1/D1");
        Directory_subtype d2=new Directory_subtype(10,"D2");
        Directory_subtype d22=new Directory_subtype(3,"D22/D2");
        FileSystem_CompositeClass f22=new File_subtype(30,"F22/D22/D2");

        root.add(d1);root.add(d2);
        d1.add(f1);
        d2.add(d22);d22.add(f22);
        d22.rename("D222");
        f22.rename("F222");
        System.out.println(f22.getName());
        System.out.println(" With Composite ");
        System.out.println(root.getSize());

        System.out.println(" Without Composite pattern ");
        System.out.println(root.getSizeWithoutComposite());

    }
}
