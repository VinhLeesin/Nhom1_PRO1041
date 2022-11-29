package domainModels;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author ADMIN
 */
@Entity(name = "NhanVien")
public class NhanVien implements Serializable {

    @Id
    @Column(name = "MaNV")
    private String maNV;

    @Column(name = "TenNhanVien")
    private String tenNV;

    @Column(name = "GioiTinh")
    private Boolean gioiTinhNV;

    @Column(name = "NgaySinh")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ngaySinhNV;

    @Column(name = "SoDienThoai")
    private String sdtNV;

    @Column(name = "DiaChi")
    private String diaChiNV;

    @Column(name = "Hinh")
    private String image;

    @Column(name = "NgayBatDauLam")
    private String ngayBDlam;

    @Column(name = "GhiChu")
    private String ghiChu;

    public NhanVien(String maNV, String tenNV, Boolean gioiTinhNV, Date ngaySinhNV, String sdtNV, String diaChiNV, String image, String ngayBDlam, String ghiChu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinhNV = gioiTinhNV;
        this.ngaySinhNV = ngaySinhNV;
        this.sdtNV = sdtNV;
        this.diaChiNV = diaChiNV;
        this.image = image;
        this.ngayBDlam = ngayBDlam;
        this.ghiChu = ghiChu;
    }

    public NhanVien() {
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public Boolean getGioiTinhNV() {
        return gioiTinhNV;
    }

    public void setGioiTinhNV(Boolean gioiTinhNV) {
        this.gioiTinhNV = gioiTinhNV;
    }

    public Date getNgaySinhNV() {
        return ngaySinhNV;
    }

    public void setNgaySinhNV(Date ngaySinhNV) {
        this.ngaySinhNV = ngaySinhNV;
    }

    public String getSdtNV() {
        return sdtNV;
    }

    public void setSdtNV(String sdtNV) {
        this.sdtNV = sdtNV;
    }

    public String getDiaChiNV() {
        return diaChiNV;
    }

    public void setDiaChiNV(String diaChiNV) {
        this.diaChiNV = diaChiNV;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNgayBDlam() {
        return ngayBDlam;
    }

    public void setNgayBDlam(String ngayBDlam) {
        this.ngayBDlam = ngayBDlam;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
