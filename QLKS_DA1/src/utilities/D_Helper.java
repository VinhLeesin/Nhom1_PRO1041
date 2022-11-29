
package utilities;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.DBContext;


public class D_Helper {
 public static ResultSet selectALL(String sql, Object... params) {
        PreparedStatement pstm=null;
        ResultSet rs=null;
        Connection con=null;
        try {
            con= DBContext.getConnect();
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstm.setObject(i+1, params[i]);
            }
            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
            close(con, pstm,rs);
            return null;
        }

    }   
 public static void  close(Connection con, PreparedStatement pstm){
     
     try {
         pstm.close();
         con.close();
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
 }
 public static void  close(Connection con, PreparedStatement pstm, ResultSet rs){
     
     try {
         rs.close();
         close(con, pstm);
     } catch (SQLException ex) {
         ex.printStackTrace();
     }
 }
 public static int updateTongQuat(String sql, Object...params){  
         PreparedStatement pstm=null;
         Connection con=null ;
     try {
         con=DBContext.getConnect();
         pstm=con.prepareStatement(sql);
         for(int i=0;i<params.length; i++){
            pstm.setObject(i+1, params[i]);
         }
         return pstm.executeUpdate();
     } catch (SQLException ex) {
        
         ex.printStackTrace();
         return 0;
     }
     finally{
         close(con, pstm);
     }
        
     } 
    
}
