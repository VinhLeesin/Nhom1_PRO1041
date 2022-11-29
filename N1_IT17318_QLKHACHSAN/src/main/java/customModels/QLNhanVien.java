package customModels;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class QLNhanVien {

    private String maNV;
    private String tenNV;
    private Boolean gioiTinhNV;
    private Date ngaySinhNV;
    private String sdtNV;
    private String diaChiNV;
    private String image;

    public QLNhanVien(String maNV, String tenNV, Boolean gioiTinhNV, Date ngaySinhNV, String sdtNV, String diaChiNV, String image) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.gioiTinhNV = gioiTinhNV;
        this.ngaySinhNV = ngaySinhNV;
        this.sdtNV = sdtNV;
        this.diaChiNV = diaChiNV;
        this.image = image;
    }

    public QLNhanVien() {
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

    public Date getNgaySinhNV() {
        return ngaySinhNV;
    }

    public void setNgaySinhNV(Date ngaySinhNV) {
        this.ngaySinhNV = ngaySinhNV;
    }

    public Boolean getGioiTinhNV() {
        return gioiTinhNV;
    }

    public void setGioiTinhNV(Boolean gioiTinhNV) {
        this.gioiTinhNV = gioiTinhNV;
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

}
