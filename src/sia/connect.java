/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sia;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author Dewi
 */
public class connect {
     private static Connection sia;
   
   public static Connection GetConnection()throws SQLException{
       if (sia==null){
           new Driver();
           
         sia=DriverManager.getConnection("jdbc:mysql://localhost:3306/SIA","root","");
       }
       return sia;
   }
    
}
