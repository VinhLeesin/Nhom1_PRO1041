/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author MrpDuy
 */
public class dthuephong {
    int idthue;
    String MaKH;
    String MaPhong;
    int LoaiHinhThue;
    String NgayThue;
    String NgayRaDuKien;
    int SoNguoi;
    String TenUser;
    int trangthai;
    double TienCoc;
    public dthuephong() {
        
    }

    public dthuephong(int idthue, String MaKH, String MaPhong, int LoaiHinhThue, String NgayThue, String NgayRaDuKien, int SoNguoi, String TenUser, int trangthai, double TienCoc) {
        this.idthue = idthue;
        this.MaKH = MaKH;
        this.MaPhong = MaPhong;
        this.LoaiHinhThue = LoaiHinhThue;
        this.NgayThue = NgayThue;
        this.NgayRaDuKien = NgayRaDuKien;
        this.SoNguoi = SoNguoi;
        this.TenUser = TenUser;
        this.trangthai = trangthai;
        this.TienCoc = TienCoc;
    }

    public int getIdthue() {
        return idthue;
    }

    public void setIdthue(int idthue) {
        this.idthue = idthue;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public int getLoaiHinhThue() {
        return LoaiHinhThue;
    }

    public void setLoaiHinhThue(int LoaiHinhThue) {
        this.LoaiHinhThue = LoaiHinhThue;
    }

    public String getNgayThue() {
        return NgayThue;
    }

    public void setNgayThue(String NgayThue) {
        this.NgayThue = NgayThue;
    }

    public String getNgayRaDuKien() {
        return NgayRaDuKien;
    }

    public void setNgayRaDuKien(String NgayRaDuKien) {
        this.NgayRaDuKien = NgayRaDuKien;
    }

    public int getSoNguoi() {
        return SoNguoi;
    }

    public void setSoNguoi(int SoNguoi) {
        this.SoNguoi = SoNguoi;
    }

    public String getTenUser() {
        return TenUser;
    }

    public void setTenUser(String TenUser) {
        this.TenUser = TenUser;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public double getTienCoc() {
        return TienCoc;
    }

    public void setTienCoc(double TienCoc) {
        this.TienCoc = TienCoc;
    }
    
    public String ttrang(){
    String a=null;
    
    if(trangthai==0){
    a="Chưa thanh toán";
    }
    else {
        a="Đã thanh toán";
    }
    return a;
    }

    

    

    
}
