package customModels;

import domainModels.ChucVu;
import domainModels.NhanVien;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class QLTaiKhoan {

    private String tenTK;
    private String MatKhau;
    private NhanVien nhanVien;
    private ChucVu chucVu;
    private String ngayLap;

    public QLTaiKhoan() {
    }

    public QLTaiKhoan(String tenTK, String MatKhau, NhanVien nhanVien, ChucVu chucVu, String ngayLap) {
        this.tenTK = tenTK;
        this.MatKhau = MatKhau;
        this.nhanVien = nhanVien;
        this.chucVu = chucVu;
        this.ngayLap = ngayLap;
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

}
