package service;

import java.util.ArrayList;
import java.util.List;
import domainModels.ChucVu;
import repository.IchucVuRepository;
import repository.chucVuRepository;
import customModels.QLChucVu;

/**
 *
 * @author thanh
 */
public class chucVuService implements IchucVuService {

    private final IchucVuRepository _IchucVuRepository;
    List<QLChucVu> listChucVu;

    public chucVuService() {
        _IchucVuRepository = new chucVuRepository();
        listChucVu = new ArrayList<>();
    }

    @Override
    public List<QLChucVu> getListChucVu() {
        listChucVu = new ArrayList<>();
        var chucVu = _IchucVuRepository.getlistChucVu();
        for (ChucVu cv : chucVu) {
            listChucVu.add(new QLChucVu(cv.getMaChucVu(), cv.getTenChucVu(), cv.getMoTa()));
        }
        return listChucVu;
    }

    @Override
    public List<QLChucVu> getChucVuByMa(String maCV) {
        listChucVu = new ArrayList<>();
        var chucVu = _IchucVuRepository.getChucVuByMa(maCV);
        for (ChucVu cv : chucVu) {
            listChucVu.add(new QLChucVu(cv.getMaChucVu(), cv.getTenChucVu(), cv.getMoTa()));
        }
        return listChucVu;
    }

    @Override
    public QLChucVu createChucVu(QLChucVu qlcv) {
        var x = _IchucVuRepository.save(new ChucVu(qlcv.getMaChucVu(), qlcv.getTenChucVu(), qlcv.getMoTa()));
        return new QLChucVu(x.getMaChucVu(), x.getTenChucVu(), x.getMoTa());
    }

    @Override
    public QLChucVu updateChucVu(QLChucVu qlcv) {
        var x = _IchucVuRepository.save(new ChucVu(qlcv.getMaChucVu(), qlcv.getTenChucVu(), qlcv.getMoTa()));
        return new QLChucVu(x.getMaChucVu(), x.getTenChucVu(), x.getMoTa());
    }

    @Override
    public String deleteChucVu(String maCV) {
        return _IchucVuRepository.delete(maCV);
    }

    @Override
    public List<QLChucVu> getChucVuByName(String tenCV) {
        listChucVu = new ArrayList<>();
        var chucVu = _IchucVuRepository.getChucVuByMa(tenCV);
        for (ChucVu cv : chucVu) {
            listChucVu.add(new QLChucVu(cv.getMaChucVu(), cv.getTenChucVu(), cv.getMoTa()));
        }
        return listChucVu;
    }

    @Override
    public QLChucVu getChucVu(String tenCV) {
        var x = _IchucVuRepository.getChucVu(tenCV);
        return new QLChucVu(x.getMaChucVu(), x.getTenChucVu(), x.getMoTa());
    }

}
