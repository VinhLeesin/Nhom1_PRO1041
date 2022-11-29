package service;

import customModels.QLNhanVien;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface InhanVienService {

    List<QLNhanVien> getListNhanVien();

    List<QLNhanVien> getNhanVienByMaNV(String maNV);

    List<QLNhanVien> getNhanVienByName(String tenNV);

    QLNhanVien createNhanVien(QLNhanVien qlnv);

    QLNhanVien updateNhanVien(QLNhanVien qlnv);

    String deleteNhanVien(String maNV);

    List<QLNhanVien> findNhanVienByName(String tenNV, String diaChiNV);

    List<QLNhanVien> OrderNhanVienByMaNV();

    List<QLNhanVien> OrderNhanVienByName();

    List<QLNhanVien> OrderNhanVienByDiaChi();

    QLNhanVien getNhanVien(String tenNV);
}
