/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodel.KhachHang;
import domainmodel.LoaiKH;
import utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import viewmodel.KhachHangModel;
import viewmodel.QlyLoaiKH;
/**
 *
 * @author FPTSHOP
 */
public class KhachHangRepository {
    private DBContext connection;
    
    public ArrayList<KhachHangModel> getListFromDb(){
        ArrayList<KhachHangModel> list = new ArrayList<>();
        String sql = "select KhachHang.MaKhachHang, KhachHang.MaLoaiKH, "
                + "TenKhachHang, NgaySinh, GioiTinh, SoDienThoai, SoCMND "
                + "from KhachHang join LoaiKhachHang " 
                + "on KhachHang.MaLoaiKH = LoaiKhachHang.MaLoaiKH";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    KhachHangModel kh = new KhachHangModel();
                    kh.setMaKh(rs.getString(1));
                    QlyLoaiKH l = new QlyLoaiKH();
                    l.setMaLoai(rs.getString(2));
                    kh.setMaLoai(l);
                    kh.setTenKh(rs.getString(3));
                    kh.setGioiTinh(rs.getInt(5));
                    kh.setNgaySinh(rs.getString(4));
                    kh.setSdt(rs.getString(6));
                    kh.setSoCMND(rs.getString(7));
                    list.add(kh);
                }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public ArrayList<LoaiKH> getMaLoaiKH(){
        ArrayList<LoaiKH> list = new ArrayList<>();
        String query = "select MaLoaiKH, TenLoaiKH from LoaiKhachHang";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                LoaiKH l = new LoaiKH();
                l.setMaLoaiKH(rs.getString(1));
                l.setTenLoaiKH(rs.getString(2));
                list.add(l);
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    
    public Boolean insert(KhachHang kh){
        String query = "insert into KhachHang(MaKhachHang, MaLoaiKH, TenKhachHang,"
                + " NgaySinh, GioiTinh, SoDienThoai, SoCMND) values\n" 
                + "(?, ?, ?, ?, ?, ?, ?)";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, kh.getMaKh());
            ps.setObject(2, kh.getMaLoai().getMaLoaiKH());
            ps.setObject(3, kh.getTenKh());
            ps.setObject(4, kh.getNgaySinh());
            ps.setObject(5, kh.getGioiTinh());
            ps.setObject(6, kh.getSdt());
            ps.setObject(7, kh.getSoCMND());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Boolean update(String id, KhachHang kh){
         String query = "update KhachHang set MaLoaiKH = ?, TenKhachHang = ?, "
                 + "NgaySinh = ?, GioiTinh = ?, SoDienThoai = ?, SoCMND = ? "
                 + "where MaKhachHang = ?";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(query)) {
            
            ps.setObject(1, kh.getMaLoai().getMaLoaiKH());
            ps.setObject(2, kh.getTenKh());
            ps.setObject(3, kh.getNgaySinh());
            ps.setObject(4, kh.getGioiTinh());
            ps.setObject(5, kh.getSdt());
            ps.setObject(6, kh.getSoCMND());
            ps.setObject(7, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Boolean delete(String id){
         String query = "delete from KhachHang where MaKhachHang = ?";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(query)) {
            
            ps.setObject(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public ArrayList<KhachHangModel> timKiem(String id){
        ArrayList<KhachHangModel> list = new ArrayList<>();
        String sql = "select MaKhachHang,KhachHang.MaLoaiKH, TenKhachHang, NgaySinh,"
                + " GioiTinh, SoDienThoai, SoCMND from KhachHang join LoaiKhachHang\n" 
                + " on KhachHang.MaLoaiKH = LoaiKhachHang.MaLoaiKH\n" 
                + " where MaKhachHang like '%" + id +"%'";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(sql)) {
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    KhachHangModel kh = new KhachHangModel();
                    kh.setMaKh(rs.getString(1));
                    QlyLoaiKH l = new QlyLoaiKH();
                    l.setMaLoai(rs.getString(2));
                    kh.setMaLoai(l);
                    kh.setTenKh(rs.getString(3));
                    kh.setGioiTinh(rs.getInt(4));
                    kh.setNgaySinh(rs.getString(5));
                    kh.setSdt(rs.getString(6));
                    kh.setSoCMND(rs.getString(7));
                    list.add(kh);
                }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
            
    public static void main(String[] args) {
        ArrayList<KhachHangModel> list = new KhachHangRepository().getListFromDb();
        for(KhachHangModel x: list){
            System.out.println(x.toString());
        }
                
    }
}
