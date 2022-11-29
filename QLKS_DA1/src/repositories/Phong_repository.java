/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodel.dloaiphong;
import domainmodel.dphong;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utilities.D_Helper;

/**
 *
 * @author MrpDuy
 */
public class Phong_repository {
    public static List<dphong> getAlldata(){
        List<dphong> listPhong = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT MaPhong,Phong.MaLoaiPhong,DienTich,MaTang,Hinh,TinhTrang,GhiChu,"
                + "TenLoaiPhong,GiaTheoGio,GiaTheoNgay FROM Phong JOIN dbo.LoaiPhong"
                + " ON LoaiPhong.MaLoaiPhong = Phong.MaLoaiPhong";
        rs=D_Helper.selectALL(sql);
        try {
            while (rs.next()) {                
               String ma =rs.getString("MaPhong");
               String LP =rs.getString("MaLoaiPhong");
               int dientich =rs.getInt("DienTich");
               int mtang =rs.getInt("MaTang");
               String hinh =rs.getString("Hinh");
               int ttrang =rs.getInt("TinhTrang");
               String gchu =rs.getString("GhiChu"); 
               String ten =rs.getString("TenLoaiPhong");
               Double gGio =rs.getDouble("GiaTheoGio");
               Double gNgay =rs.getDouble("GiaTheoNgay");
               dloaiphong loaip = new dloaiphong( ten, gGio, gNgay);
               dphong phong = new dphong(ma, LP, dientich, mtang, hinh, ttrang, gchu, loaip);
              listPhong.add(phong);
            }
            return listPhong;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     public  List<dphong> getdatawhereTT(int tinhtrang){
         List<dphong> listPhong = new ArrayList<>();
        ResultSet rs;
        String sql ="SELECT MaPhong,phong.MaLoaiPhong,DienTich,MaTang,Hinh,TinhTrang,GhiChu,"
                + "TenLoaiPhong,GiaTheoGio,GiaTheoNgay FROM Phong JOIN dbo.LoaiPhong"
                + " ON LoaiPhong.MaLoaiPhong = Phong.MaLoaiPhong where tinhtrang=?";
        rs=D_Helper.selectALL(sql,tinhtrang);
        try {
            while (rs.next()) {                
               String ma =rs.getString("MaPhong");
               String LP =rs.getString("MaLoaiPhong");
               int dientich =rs.getInt("DienTich");
               int mtang =rs.getInt("MaTang");
               String hinh =rs.getString("Hinh");
               int ttrang =rs.getInt("TinhTrang");
               String gchu =rs.getString("GhiChu"); 
               String ten =rs.getString("TenLoaiPhong");
               Double gGio =rs.getDouble("GiaTheoGio");
               Double gNgay =rs.getDouble("GiaTheoNgay");
               dloaiphong loaip = new dloaiphong( ten, gGio, gNgay);
               dphong phong = new dphong(ma, LP, dientich, mtang, hinh, ttrang, gchu, loaip);
              listPhong.add(phong);
            }
            return listPhong;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     
     
     public int  themCH(dphong p){
    String sql="INSERT INTO phong (maphong,maloaiphong,dientich,matang,hinh,tinhtrang,ghichu) VALUES(?,?,?,?,?,?,?,?,?)";
    return D_Helper.updateTongQuat(sql,p.getMap(),p.getMaloaip(),p.getDientich(),p.getMat(),p.getHinh(),p.getTtrang(),p.getGchu());
    }
    public int   xoaCH(dphong p){
    String sql="DELETE FROM phong WHERE Maphong =?";
    return D_Helper.updateTongQuat(sql,p.getMap());
    }
    public int  suaCH(dphong p){
    String sql="UPDATE dbo.phong SET maloaiphong=?,dientich=?,matang=?,hinh=?,tinhtrang=?,ghichu=? WHERE maphong=?";
    return D_Helper.updateTongQuat(sql,p.getMaloaip(),p.getDientich(),p.getMat(),p.getHinh(),p.getTtrang(),p.getGchu(),p.getMap());
    }
    public int doitt(int tt,String madp){
    String sql="UPDATE phong set tinhtrang=? WHERE Maphong =?";
    return D_Helper.updateTongQuat(sql,tt,madp);
    }
    
    
}
