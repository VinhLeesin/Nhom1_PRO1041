/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author MrpDuy
 */
public class dKhachhang {
    private String maKH;
    private String MaLKH;
    private String TenKH;
    private String ngSinh;
    private int gTinh;
    private String SDT;
    private String CCCD;

    public dKhachhang() {
    }

    public dKhachhang(String maKH, String MaLKH, String TenKH, String ngSinh, int gTinh, String SDT, String CCCD) {
        this.maKH = maKH;
        this.MaLKH = MaLKH;
        this.TenKH = TenKH;
        this.ngSinh = ngSinh;
        this.gTinh = gTinh;
        this.SDT = SDT;
        this.CCCD = CCCD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaLKH() {
        return MaLKH;
    }

    public void setMaLKH(String MaLKH) {
        this.MaLKH = MaLKH;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(String ngSinh) {
        this.ngSinh = ngSinh;
    }

    public int getgTinh() {
        return gTinh;
    }

    public void setgTinh(int gTinh) {
        this.gTinh = gTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    

    
    public String gioitinh(){
    String gt;
    if(gTinh==0){
    gt="Nam";
    }else
        gt="Nữ";
    return gt;
    }
    
}
