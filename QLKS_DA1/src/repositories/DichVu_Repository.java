/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.util.ArrayList;
import viewmodel.DichVu;
import java.sql.*;
import utilities.D_Helper;

public class DichVu_Repository {

    public static ArrayList<DichVu> AllDichVu() {
        ArrayList<DichVu> List = new ArrayList<>();
        ResultSet rs;
        String sql = "select * from DichVu";
        rs = D_Helper.selectALL(sql);
        try {
            while (rs.next()) {
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                String donvi = rs.getString(3);
                double dongia = rs.getDouble(4);
                String ghichu = rs.getString(5);
                DichVu a = new DichVu(ma, ten, donvi, dongia, ghichu);
                List.add(a);
            }
            return List;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static ArrayList<DichVu> Tim(String timten) {
        ArrayList<DichVu> List = new ArrayList<>();
        ResultSet rs;
        String sql = "select * from dichvu where tendichvu like ?";
        rs = D_Helper.selectALL(sql,timten);
        try {
            while (rs.next()) {
                 String ma = rs.getString(1);
                String ten = rs.getString(2);
                String donvi = rs.getString(3);
                double dongia = rs.getDouble(4);
                String ghichu = rs.getString(5);
                DichVu a = new DichVu(ma, ten, donvi, dongia, ghichu);
                List.add(a);
            }
            return List;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int ThemDV(DichVu dv) {
        String sql = "insert into dichvu values(?,?,?,?,?)";
        return D_Helper.updateTongQuat(sql, dv.getMadv(), dv.getTendvl(), dv.getDonvi(), dv.getDongia(), dv.getGhiChu());
    }
    public static int SuaDV(DichVu dv) {
        String sql = "update dichvu set tendichvu=?,donvi=?,dongia=?,ghichu=? where madichvu=?";
        return D_Helper.updateTongQuat(sql,  dv.getTendvl(), dv.getDonvi(), dv.getDongia(), dv.getGhiChu(),dv.getMadv());
    }
    public static int XoaDV(String ma) {
        String sql = "delete dichvu where madichvu=?";
        return D_Helper.updateTongQuat(sql,ma);
    }
}
