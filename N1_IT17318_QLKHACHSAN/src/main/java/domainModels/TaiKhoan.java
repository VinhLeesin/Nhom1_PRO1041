package domainModels;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author ADMIN
 */
@Entity(name = "TaiKhoan")
public class TaiKhoan implements Serializable {

    @Id
    @Column(name = "TenTK")
    private String tenTK;

    @Column(name = "MatKhau")
    private String MatKhau;

    @OneToOne
    @JoinColumn(name = "MaNV", nullable = false)
    private NhanVien nhanVien;
    @OneToOne
    @JoinColumn(name = "MaChucVu", nullable = false)
    private ChucVu chucVu;

    @Column(name = "Ngaylap")
    private String ngayLap;

    @Column(name = "GhiChu")
    private String ghiChu;

    public TaiKhoan(String tenTK, String MatKhau, NhanVien nhanVien, ChucVu chucVu, String ngayLap, String ghiChu) {
        this.tenTK = tenTK;
        this.MatKhau = MatKhau;
        this.nhanVien = nhanVien;
        this.chucVu = chucVu;
        this.ngayLap = ngayLap;
        this.ghiChu = ghiChu;
    }

    public TaiKhoan() {
    }

    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public ChucVu getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVu chucVu) {
        this.chucVu = chucVu;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
