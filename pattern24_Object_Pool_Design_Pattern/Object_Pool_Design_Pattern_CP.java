package src.design00_Patterns.pattern24_Object_Pool_Design_Pattern;

import java.sql.Connection;

public class Object_Pool_Design_Pattern_CP {
    public static void main(String[] args) {

        JDBC_ObjectPool jdbc=new JDBC_ObjectPool("a","b","c","d");

        Connection con= jdbc.takeOut();
        jdbc.takeIn(con);


    }
}
