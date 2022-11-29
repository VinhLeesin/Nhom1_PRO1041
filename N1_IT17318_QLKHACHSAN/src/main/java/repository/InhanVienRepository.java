package repository;

import java.util.List;
import domainModels.NhanVien;

/**
 *
 * @author ADMIN
 */
public interface InhanVienRepository {

    List<NhanVien> getListNhanVien();

    List<NhanVien> getNhanVienByMaNV(String maNV);

    List<NhanVien> getNhanVienByName(String tenNV);

    NhanVien save(NhanVien nhanVien);

    String deleteNhanVien(String maNV);

    List<NhanVien> findNhanVienByName(String tenNV, String diaChiNV);

    List<NhanVien> OrderNhanVienByMaNV();

    List<NhanVien> OrderNhanVienByName();

    List<NhanVien> OrderNhanVienByDiaChi();

    NhanVien getNhanVien(String tenNV);

}
