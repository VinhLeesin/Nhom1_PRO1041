/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ADMIN
 */
public class DBContext {
    static String url="jdbc:sqlserver://localhost\\DESKTOP-HGOU1M7\\SQLEXPRESS:1433;databaseName=QLKS_DB";
     static String user="sa";
      static String pass="duyvip00";
      
      static{
        try { 
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            //Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
          
      }
      public static Connection getConnect(){
        try {
            Connection con=DriverManager.getConnection(url, user, pass);
       return con;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
           //Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      
    
}
