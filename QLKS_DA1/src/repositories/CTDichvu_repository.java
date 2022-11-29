/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodel.dDichvuCT;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.D_Helper;

/**
 *
 * @author MrpDuy
 */
public class CTDichvu_repository {
    
    public static List<dDichvuCT> getAlldata(){
        List<dDichvuCT> listthuephong = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT MaCTDV,MaDatPhong,MaDichVu,DonGia, SoLuong,ThanhTien FROM dbo.ChiTietDichVu";
        rs=D_Helper.selectALL(sql);
        try {
            while (rs.next()) {
               int idctdv = rs.getInt("MaCTDV");
               int iddp = rs.getInt("MaDatPhong");
               String madv = rs.getString("MaDichVu");
               double dongia = rs.getDouble("DonGia");
               int sl = rs.getInt("SoLuong");
               double tt= rs.getDouble("ThanhTien");
               dDichvuCT tp = new dDichvuCT(idctdv, iddp, madv, dongia, sl, tt);
               listthuephong.add(tp);
            }
            return listthuephong;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
    public static List<dDichvuCT> getdvgtheoma(int MaDatPhong){
         List<dDichvuCT> listthuephong = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT MaCTDV,MaDatPhong,MaDichVu,DonGia, SoLuong,ThanhTien FROM dbo.ChiTietDichVu where MaDatPhong=?";
        rs=D_Helper.selectALL(sql,MaDatPhong);
        try {
            while (rs.next()) {
               int idctdv = rs.getInt("MaCTDV");
               int iddp = rs.getInt("MaDatPhong");
               String madv = rs.getString("MaDichVu");
               double dongia = rs.getDouble("DonGia");
               int sl = rs.getInt("SoLuong");
               double tt= rs.getDouble("ThanhTien");
               dDichvuCT tp = new dDichvuCT(idctdv, iddp, madv, dongia, sl, tt);
               listthuephong.add(tp);
            }
            return listthuephong;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public static int insert(dDichvuCT dv){
    String sql = "INSERT INTO dbo.ChiTietDichVu ( MaDatPhong,MaDichVu,DonGia, SoLuong,ThanhTien) VALUES(?,?,?,?,?)";
    return  D_Helper.updateTongQuat(sql, dv.getIddp(),dv.getMadv(),dv.getDongia(),dv.getSoluong(),dv.getThanhtien());
    }
    public static int delete(String idct){
    String sql = "delete from dbo.ChiTietDichVu where MaCTDV=?";
    return  D_Helper.updateTongQuat(sql, idct);
    }
    
    
}
