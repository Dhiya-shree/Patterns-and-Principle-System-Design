package src.design00_Patterns.pattern24_Object_Pool_Design_Pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_ObjectPool extends ObjectPool<Connection>{

    String dsn,usr,pwd;

    public JDBC_ObjectPool(String dsn, String usr, String pwd,String driver) {
        super();
        try{
            /**
            Class d=Class.forName(driver);
            Object drv=  d.getDeclaredConstructor().newInstance();
             **/
        }
        catch(Exception e){
            System.out.println(" Exception");
        }
        this.dsn = dsn;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    Connection create() {
        try{
            return DriverManager.getConnection(dsn,usr,pwd);
        }
        catch(SQLException s){
            System.out.println(" Error "+s);
        }
        return null;
    }

    @Override
    boolean validate(Connection obj) {
        try{
            return obj.isClosed();
        }
        catch(SQLException s){
            System.out.println(" Error "+s);
            return false;
        }
    }

    @Override
    void dead(Connection obj) {
        try{
             obj.close();
        }
        catch(SQLException s){
            System.out.println(" Error "+s);
        }
    }
}
