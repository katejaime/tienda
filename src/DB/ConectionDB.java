
package DB;

import java.sql.*;
import java.util.logging.*;

public class ConectionDB {
    
    private String url = "src/DB/";
    private String driver = "jdbc:sqlite";
    private String db = "tienda.db";
    private Connection con = null;
    private Statement  stmt = null;
    private ResultSet rs = null;
    
    public ConectionDB() {
        String direccion = driver + ":" + url + db;
        try{
            con = DriverManager.getConnection(direccion);
            if(con != null){
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("Base de datos conectada " + meta.getDriverName());
            }
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public Connection getConection(){
        return con;
    }
    
    private void closeConnection(Connection con){
       if(con != null){
           try{
               con.close();
           }catch(SQLException ex){
               Logger.getLogger(ConectionDB.class.getName()).log(Level.SEVERE,null, ex);
           }
       } 
    }
    
    public void closeConnection(){
        closeConnection(con);
    }
    // consulta SELECT *
    public ResultSet find(String sql){
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
        }catch(SQLException ex){
            System.out.println("Error en conexionDB.java: " + ex.getMessage());   
        }catch(RuntimeException ex){
            System.out.println("Error en conexionDB.java: " + ex.getMessage());   
        }catch(Exception ex){
            System.out.println("Error en conexionDB.java: " + ex.getMessage());   
        }
        return rs;
    }
        
    public boolean execute(String sql){ 
        try{
            stmt = con.createStatement();
            return stmt.executeUpdate(sql)>0;
        }catch(SQLException ex){
            System.out.println("Error en conexionDB.java: " + ex.getMessage());
            return false;
        }catch(RuntimeException ex){
            System.out.println("Error en conexionDB.java: " + ex.getMessage());
            return false;
        }catch(Exception ex){
            System.out.println("Error en conexionDB.java: " + ex.getMessage());
            return false;
        }
    }
    
}
