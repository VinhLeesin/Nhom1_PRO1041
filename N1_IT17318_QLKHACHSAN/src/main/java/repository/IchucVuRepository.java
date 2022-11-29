package repository;

import java.util.List;
import domainModels.ChucVu;

/**
 *
 * @author thanh
 */
public interface IchucVuRepository {

    List<ChucVu> getlistChucVu();

    List<ChucVu> getChucVuByMa(String maCV);

    ChucVu getChucVu(String tenCV);

    ChucVu save(ChucVu chucVu);

    String delete(String maCV);

    List<ChucVu> getChucVuByName(String tenCV);
}
