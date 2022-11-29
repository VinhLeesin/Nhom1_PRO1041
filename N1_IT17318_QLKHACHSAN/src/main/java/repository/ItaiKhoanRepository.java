package repository;

import domainModels.TaiKhoan;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ItaiKhoanRepository {

    List<TaiKhoan> getListTaiKhoan();

    List<TaiKhoan> getTaiKhoanByName(String tenTK);

    TaiKhoan save(TaiKhoan taiKhoan);

    String deleteTaiKhoan(String tenTK);
}
