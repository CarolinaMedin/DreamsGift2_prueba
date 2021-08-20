
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Usuario
 */
public class ConexionBD {  
 
       
   
     public static void main(String[] args) throws SQLException {
    
       
      try{
        Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/dreamgifts", "root", "");
        Statement miStatement=miConexion.createStatement();
        ResultSet miResultSet=miStatement.executeQuery("SELECT * FROM usuarios ");
        System.out.println("Conexion establecida");
       while(miResultSet.next()){
        
        System.out.println(miResultSet.getString("usu_id_usuario")+" " +miResultSet.getString("usu_nombre")+" " +miResultSet.getString("usu_apellido")+" " +miResultSet.getString("usu_username")+" " +miResultSet.getString("usu_clave")+" " +miResultSet.getString("usu_estado")+" ");
        
                
           
            
        }
    }catch(Exception e){
          System.out.println("No hay conexion a base de datos!!");
            e.printStackTrace();
    }
       
  
   }
 
}
