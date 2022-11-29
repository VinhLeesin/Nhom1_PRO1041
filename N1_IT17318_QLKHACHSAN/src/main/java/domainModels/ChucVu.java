package domainModels;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author thanh
 */
@Entity(name = "ChucVu")
public class ChucVu implements Serializable {

    @Id
    @Column(name = "MaChucVu")
    private String maChucVu;

    @Column(name = "TenChucVu")
    private String tenChucVu;

    @Column(name = "MoTa")
    private String moTa;

    public ChucVu(String maChucVu, String tenChucVu, String moTa) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.moTa = moTa;
    }

    public ChucVu() {
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
