package service;

import customModels.QLTaiKhoan;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ItaiKhoanService {

    List<QLTaiKhoan> getListTaiKhoan();

    List<QLTaiKhoan> getTaiKhoanByName(String tenTK);

    QLTaiKhoan createTaiKhoan(QLTaiKhoan qltk);

    QLTaiKhoan updateTaiKhoan(QLTaiKhoan qltk);

    String deleteTaiKhoan(String tenTK);
}
