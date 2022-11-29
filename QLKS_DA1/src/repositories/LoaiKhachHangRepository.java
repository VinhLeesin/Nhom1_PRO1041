/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import domainmodel.LoaiKH;
import utilities.DBContext;
import java.sql.*;
import java.util.ArrayList;
import viewmodel.QlyLoaiKH;

/**
 *
 * @author FPTSHOP
 */
public class LoaiKhachHangRepository {
    private DBContext connection;
    
    public ArrayList<QlyLoaiKH> getListLoaiFromDB(){
        ArrayList<QlyLoaiKH> list = new ArrayList<>();
        String sql = "select MaLoaiKH, TenLoaiKH, TienGiam, MoTa from LoaiKhachHang "; 
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                QlyLoaiKH l = new QlyLoaiKH();
                l.setMaLoai(rs.getString(1));
                l.setTenLoai(rs.getString(2));
                l.setTienGiam(rs.getInt(3));
                l.setMoTa(rs.getString(4));
                list.add(l);
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    public Boolean insert(LoaiKH l){
        String query = "insert into LoaiKhachHang(MaLoaiKH, TenLoaiKH, TienGiam, MoTa)"
                + " values (?, ?, ?, ?)";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, l.getMaLoaiKH());
            ps.setObject(2, l.getTenLoaiKH());
            ps.setObject(3, l.getTienGiam());
            ps.setObject(4, l.getMoTa());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Boolean update(String id, LoaiKH l){
        String query = "update LoaiKhachHang set TenLoaiKH = ? , TienGiam = ?,"
                + "  MoTa = ? where MaLoaiKH = ? ";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, l.getTenLoaiKH());
            ps.setObject(2, l.getTienGiam());
            ps.setObject(3, l.getMoTa());
            ps.setObject(4, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public Boolean delete(String id){
        String query = "delete from LoaiKhachHang where MaLoaiKH = ?";
        try(Connection con = connection.getConnect();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);           
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static void main(String[] args) {
        ArrayList<QlyLoaiKH> list = new LoaiKhachHangRepository().getListLoaiFromDB();
        for(QlyLoaiKH x: list){
            System.out.println(x.toString());
        }
    }
    
}
