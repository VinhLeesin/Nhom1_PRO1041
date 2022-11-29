/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodel.dKhachhang;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.D_Helper;

/**
 *
 * @author MrpDuy
 */
public class KH_repository {
    public static List<dKhachhang> getAlldataKH(){
        List<dKhachhang> listKH = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT * FROM Khachhang";
        rs=D_Helper.selectALL(sql);
        try {
            while (rs.next()) {                
               String ma =rs.getString("MaKhachHang");
               String LKH =rs.getString("MaLoaiKH");
               String ten =rs.getString("TenKhachHang");
               String ngSinh =rs.getString("Ngaysinh");
               int gt =rs.getInt("GioiTinh");
               String sdt =rs.getString("SoDienThoai");
               String cccd =rs.getString("SoCMND");
               dKhachhang kh = new dKhachhang(ma, LKH, ten, ngSinh, gt, sdt, cccd);
              listKH.add(kh);
            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<dKhachhang> timkiem(String tenkh){
        List<dKhachhang> listKH = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT * FROM Khachhang WHERE TenKhachHang LIKE '%" + tenkh + "%'";
        rs=D_Helper.selectALL(sql);
        try {
            while (rs.next()) {                
               String ma =rs.getString("MaKhachHang");
               String LKH =rs.getString("MaLoaiKH");
               String ten =rs.getString("TenKhachHang");
               String ngSinh =rs.getString("Ngaysinh");
               int gt =rs.getInt("GioiTinh");
               String sdt =rs.getString("SoDienThoai");
               String cccd =rs.getString("SoCMND");
               dKhachhang kh = new dKhachhang(ma, LKH, ten, ngSinh, gt, sdt, cccd);
              listKH.add(kh);
            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     /* public dKhachhang getdatabyma(String mach){
        dKhachhang  kh = null;
        ResultSet rs;
        String sql ="SELECT * FROM dKhachhang where ma=?";
        rs=D_Helper.selectALL(sql,mach);
        try {
            while (rs.next()) {                
             
            }
            return ch;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

      
    
    public int  themCH(dKhachhang ch){
    String sql="INSERT INTO dKhachhang (Ma,Ten,tendem,ho,ngaysinh,sdt,diachi,ThanhPho,QuocGia,matkhau) VALUES(?,?,?,?,?,?,?,?,?,?)";
    return D_Helper.updateTongQuat(sql,);
    }
    public int   xoaCH(dKhachhang ch){
    String sql="DELETE FROM dbo.dKhachhang WHERE Ma =?";
    return D_Helper.updateTongQuat(sql,);
    }
    public int  suaCH(dKhachhang ch){
    String sql="UPDATE dbo.dKhachhang SET Ten=?,tendem=?,ho=?,ngaysinh=?,sdt=?,diachi=?,thanhpho=?,quocgia=?,matkhau=? WHERE Ma=?";
    return D_Helper.updateTongQuat(sql,);
    }*/
}
