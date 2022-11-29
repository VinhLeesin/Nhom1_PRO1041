package customModels;

/**
 *
 * @author ADMIN
 */
public class QLChucVu {

    private String maChucVu;
    private String tenChucVu;
    private String moTa;

    public QLChucVu(String maChucVu, String tenChucVu, String moTa) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.moTa = moTa;
    }

    public QLChucVu() {
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

}
