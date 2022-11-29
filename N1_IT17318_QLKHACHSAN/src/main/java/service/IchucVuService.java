package service;

import java.util.List;
import customModels.QLChucVu;

/**
 *
 * @author thanh
 */
public interface IchucVuService {

    List<QLChucVu> getListChucVu();

    List<QLChucVu> getChucVuByMa(String maCV);

    QLChucVu getChucVu(String tenCV);

    QLChucVu createChucVu(QLChucVu qlcv);

    QLChucVu updateChucVu(QLChucVu qlcv);

    String deleteChucVu(String maCV);

    List<QLChucVu> getChucVuByName(String tenCV);
}
