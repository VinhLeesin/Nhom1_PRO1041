/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import domainmodel.LoaiKH;

/**
 *
 * @author FPTSHOP
 */
public class KhachHangModel {
    private String maKh;
    private QlyLoaiKH maLoai;
    private String tenKh;
    private String ngaySinh;
    private int gioiTinh;
    private String sdt;
    private String soCMND;

    public KhachHangModel() {
    }

    public KhachHangModel(String maKh, QlyLoaiKH maLoai, String tenKh, String ngaySinh, int gioiTinh, String sdt, String soCMND) {
        this.maKh = maKh;
        this.maLoai = maLoai;
        this.tenKh = tenKh;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.soCMND = soCMND;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public QlyLoaiKH getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(QlyLoaiKH maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
    
    

    @Override
    public String toString() {
        return "KhachHangModel{" + "maKh=" + maKh + ", maLoai=" + maLoai.getMaLoai() + ", tenKh=" + tenKh + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ", soCMND=" + soCMND + '}';
    }

    public String getGT() {
        if(gioiTinh == 0){
            return "Nam";          
        } else {
            return "Nữ";
        }
    }
    
    
}
