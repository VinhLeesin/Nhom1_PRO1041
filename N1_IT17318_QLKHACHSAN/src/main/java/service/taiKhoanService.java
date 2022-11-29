package service;

import customModels.QLTaiKhoan;
import domainModels.TaiKhoan;
import java.util.ArrayList;
import java.util.List;
import repository.ItaiKhoanRepository;
import repository.taiKhoanRepository;

/**
 *
 * @author ADMIN
 */
public class taiKhoanService implements ItaiKhoanService {

    private final ItaiKhoanRepository _ItaiKhoanRepository;
    List<QLTaiKhoan> listQLTK;

    public taiKhoanService() {
        _ItaiKhoanRepository = new taiKhoanRepository();
        listQLTK = new ArrayList<>();
    }

    @Override
    public List<QLTaiKhoan> getListTaiKhoan() {
        listQLTK = new ArrayList<>();
        var taiKhoan = _ItaiKhoanRepository.getListTaiKhoan();
        for (TaiKhoan tk : taiKhoan) {
            listQLTK.add(new QLTaiKhoan(tk.getTenTK(), tk.getMatKhau(), tk.getNhanVien(), tk.getChucVu(), tk.getNgayLap()));

        }
        return listQLTK;
    }

    @Override
    public List<QLTaiKhoan> getTaiKhoanByName(String tenTK) {
        listQLTK = new ArrayList<>();
        var taiKhoan = _ItaiKhoanRepository.getTaiKhoanByName(tenTK);
        for (TaiKhoan tk : taiKhoan) {
            listQLTK.add(new QLTaiKhoan(tk.getTenTK(), tk.getMatKhau(), tk.getNhanVien(), tk.getChucVu(), tk.getNgayLap()));

        }
        return listQLTK;
    }

    @Override
    public QLTaiKhoan createTaiKhoan(QLTaiKhoan qltk) {
        var x = _ItaiKhoanRepository.save(new TaiKhoan(qltk.getTenTK(), qltk.getMatKhau(), qltk.getNhanVien(), qltk.getChucVu(), qltk.getNgayLap(), null));
        return new QLTaiKhoan(x.getTenTK(), x.getMatKhau(), x.getNhanVien(), x.getChucVu(), x.getNgayLap());
    }

    @Override
    public QLTaiKhoan updateTaiKhoan(QLTaiKhoan qltk) {
        var x = _ItaiKhoanRepository.save(new TaiKhoan(qltk.getTenTK(), qltk.getMatKhau(), qltk.getNhanVien(), qltk.getChucVu(), qltk.getNgayLap(), null));
        return new QLTaiKhoan(x.getTenTK(), x.getMatKhau(), x.getNhanVien(), x.getChucVu(), x.getNgayLap());
    }

    @Override
    public String deleteTaiKhoan(String tenTK) {
       return _ItaiKhoanRepository.deleteTaiKhoan(tenTK);
    }
}
