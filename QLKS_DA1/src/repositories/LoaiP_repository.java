/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;


import domainmodel.dloaiphong;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.D_Helper;

/**
 *
 * @author MrpDuy
 */
public class LoaiP_repository {
     public static List<dloaiphong> getAlldataloaiP(){
        List<dloaiphong> listKH = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT * FROM Loaiphong";
        rs=D_Helper.selectALL(sql);
        try {
            while (rs.next()) {                
               String ma =rs.getString("MaLoaiPhong");
               String ten =rs.getString("TenLoaiPhong");
               int gdon =rs.getInt("GiuongDon");
               int gdoi =rs.getInt("GiuongDoi");
               Double gGio =rs.getDouble("GiaTheoGio");
               Double gNgay =rs.getDouble("GiaTheoNgay");
               dloaiphong lp = new dloaiphong(ma, ten, gdon, gdoi, gGio, gNgay);
              listKH.add(lp);
            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
