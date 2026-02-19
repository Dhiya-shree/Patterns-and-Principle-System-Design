package src.design00_Patterns.pattern24_Object_Pool_Design_Pattern;

import java.sql.Connection;
import java.sql.SQLException;

//expensive objects - datasource
public class PooledObject {
        private Connection connection;

        public PooledObject(Connection c){
            this.connection=c;
        }

        public Connection getConnection(){
            return connection;
        }

        public void close(){
            try{
                connection.close();
            }
            catch(SQLException s){
                System.out.println(" Error "+s);
            }
        }

        public boolean isClosed(){
            try{
              return  connection.isClosed();
            }
            catch(SQLException s){
                System.out.println(" Error on checking "+s);
                return true;
            }

        }
}
