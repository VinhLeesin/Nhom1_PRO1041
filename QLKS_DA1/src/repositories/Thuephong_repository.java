/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;


import domainmodel.dthuephong;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.D_Helper;



/**
 *
 * @author MrpDuy
 */
public class Thuephong_repository {
    public static List<dthuephong> getAlldata(){
        List<dthuephong> listthuephong = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT MaDatPhong,MaKhachHang, MaPhong,LoaiHinhThue, NgayThue,NgayRaDuKien, SoNguoi,TenTK,TinhTrang,TienDatCoc FROM dbo.DatPhong";
        rs=D_Helper.selectALL(sql);
        try {
            while (rs.next()) {
               int idthue = rs.getInt("MaDatPhong");
               String makh = rs.getString("MaKhachHang");
               String map = rs.getString("MaPhong");
               int loaihinhthue = rs.getInt("LoaiHinhThue");
               String ngthue = rs.getString("NgayThue");
               String ngtra = rs.getString("NgayRaDuKien");
               int songuoi = rs.getInt("SoNguoi");
               String tentk = rs.getString("TenTK");
               int tt = rs.getInt("TinhTrang");
               double tcoc = rs.getDouble("TienDatCoc");
               dthuephong tp = new dthuephong(idthue,makh, map, loaihinhthue, ngthue, ngtra, songuoi, tentk, tt, tcoc);
               listthuephong.add(tp);
            }
            return listthuephong;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public static dthuephong getphongtheoma(String maphong){
        dthuephong tp =null;
        ResultSet rs;
        String sql ="SELECT MaDatPhong,MaKhachHang, MaPhong,LoaiHinhThue, NgayThue,NgayRaDuKien, SoNguoi,TenTK,TinhTrang,TienDatCoc FROM dbo.DatPhong where tinhtrang=0 and maphong =?";
        rs=D_Helper.selectALL(sql,maphong);
        try {
            while (rs.next()) {
               int idthue = rs.getInt("MaDatPhong");
               String makh = rs.getString("MaKhachHang");
               String map = rs.getString("MaPhong");
               int loaihinhthue = rs.getInt("LoaiHinhThue");
               String ngthue = rs.getString("NgayThue");
               String ngtra = rs.getString("NgayRaDuKien");
               int songuoi = rs.getInt("SoNguoi");
               String tentk = rs.getString("TenTK");
               int tt = rs.getInt("TinhTrang");
               double tcoc = rs.getDouble("TienDatCoc");
               tp = new dthuephong(idthue,makh, map, loaihinhthue, ngthue, ngtra, songuoi, tentk, tt, tcoc);
            }
            return tp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
   public static List<dthuephong> phongchuatt(){
        List<dthuephong> listthuephong = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT MaDatPhong,MaKhachHang, MaPhong,LoaiHinhThue, NgayThue,NgayRaDuKien, SoNguoi,TenTK,TinhTrang,TienDatCoc FROM dbo.DatPhong where TinhTrang=0 ";
        rs=D_Helper.selectALL(sql);
        try {
            while (rs.next()) {
                int idthue = rs.getInt("MaDatPhong");
               String makh = rs.getString("MaKhachHang");
               String map = rs.getString("MaPhong");
               int loaihinhthue = rs.getInt("LoaiHinhThue");
               String ngthue = rs.getString("NgayThue");
               String ngtra = rs.getString("NgayRaDuKien");
               int songuoi = rs.getInt("SoNguoi");
               String tentk = rs.getString("TenTK");
               int tt = rs.getInt("TinhTrang");
               double tcoc = rs.getDouble("TienDatCoc");
               dthuephong tp = new dthuephong(idthue,makh, map, loaihinhthue, ngthue, ngtra, songuoi, tentk, tt, tcoc);
               listthuephong.add(tp);
            }
            return listthuephong;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    
    public static int  themthuep(dthuephong tp){
    String sql="INSERT INTO dbo.DatPhong (MaKhachHang, MaPhong,LoaiHinhThue, NgayThue,NgayRaDuKien, SoNguoi,TenTK,TinhTrang,TienDatCoc) VALUES(?,?,?,?,?,?,?,?,?)";
    return D_Helper.updateTongQuat(sql,tp.getMaKH(),tp.getMaPhong(),tp.getLoaiHinhThue(),tp.getNgayThue(),tp.getNgayRaDuKien(),tp.getSoNguoi(),tp.getTenUser(),tp.getTrangthai(),tp.getTienCoc());
    }
    
    public static int  suathuep(dthuephong tp){
    String sql="UPDATE dbo.DatPhong SET LoaiHinhThue=?,NgayThue=?,NgayRaDuKien=?,SoNguoi=?,TenTK=?,TinhTrang=?,TienDatCoc=? WHERE maphong=?,makhachhang=?";
    return D_Helper.updateTongQuat(sql,tp.getLoaiHinhThue(),tp.getNgayThue(),tp.getNgayRaDuKien(),tp.getSoNguoi(),tp.getTenUser(),tp.getTrangthai(),tp.getTienCoc(),tp.getMaKH(),tp.getMaPhong());
    }
    
    public static int thanhtoan(String map){
    String sql="UPDATE DatPhong set tinhtrang='1' WHERE Maphong =?";
    return D_Helper.updateTongQuat(sql,map);
    }
    
    
}
