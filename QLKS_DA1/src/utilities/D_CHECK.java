/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author MrpDuy
 */
public class D_CHECK {
      public static boolean chkNull(String mess, JTextField txt){
        if(txt.getText().length() == 0){
            JOptionPane.showMessageDialog(null, mess);
            txt.requestFocus();
            return true;
        }else{
            return false;
        }
    }
    public static boolean chkNull(String mess, JTextArea txt){
        if(txt.getText().length() == 0){
            JOptionPane.showMessageDialog(null, mess);
            txt.requestFocus();
            return true;
        }else{
            return false;
        }
    }
    
    public static boolean chkSDT(String mess,JTextField txt){
        String SDT = "0[0-9]{9}";
        if(!txt.getText().matches(SDT)){
            JOptionPane.showMessageDialog(null,mess);
            txt.requestFocus();
            return true;
        }else{
            return false;
        }
    }
    
  
    public static boolean chkUsername(String mess,String mess2,JTextField txt){
        String chk = "^((?=.*\\d)(?=.*[A-Z])(?=.*\\W).{8,8})$";
        if(!txt.getText().matches(chk)){
            JOptionPane.showMessageDialog(null, mess);
            txt.requestFocus();
            return true;
        }else{
            if(txt.getText().length() > 20){
                JOptionPane.showMessageDialog(null, mess2);
                txt.requestFocus();
                return true;
            }else{
                return false;
            }
        }
    }
     public static boolean chkDate(String mess,JTextField txt){
        SimpleDateFormat datefm = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = datefm.parse(txt.getText());
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, mess, "Lỗi", JOptionPane.ERROR_MESSAGE);
            txt.requestFocus();
            return true;
        }
    }
}
