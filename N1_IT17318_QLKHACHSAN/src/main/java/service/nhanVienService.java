package service;

import customModels.QLNhanVien;
import domainModels.NhanVien;
import java.util.ArrayList;
import java.util.List;
import repository.InhanVienRepository;
import repository.nhanVienRepository;

/**
 *
 * @author ADMIN
 */
public class nhanVienService implements InhanVienService {

    private final InhanVienRepository _InhanVienRepository;
    private List<QLNhanVien> listQLNV;

    public nhanVienService() {
        _InhanVienRepository = new nhanVienRepository();
        listQLNV = new ArrayList<>();
    }

    @Override
    public List<QLNhanVien> getListNhanVien() {
        listQLNV = new ArrayList<>();
        var nhanVien = _InhanVienRepository.getListNhanVien();
        for (NhanVien nv : nhanVien) {
            listQLNV.add(new QLNhanVien(nv.getMaNV(), nv.getTenNV(), nv.getGioiTinhNV(), nv.getNgaySinhNV(), nv.getSdtNV(), nv.getDiaChiNV(), nv.getImage()));
        }
        return listQLNV;
    }

    @Override
    public List<QLNhanVien> getNhanVienByMaNV(String maNV) {
        listQLNV = new ArrayList<>();
        var nhanVien = _InhanVienRepository.getNhanVienByMaNV(maNV);
        for (NhanVien nv : nhanVien) {
            listQLNV.add(new QLNhanVien(nv.getMaNV(), nv.getTenNV(), nv.getGioiTinhNV(), nv.getNgaySinhNV(), nv.getSdtNV(), nv.getDiaChiNV(), nv.getImage()));
        }
        return listQLNV;
    }

    @Override
    public QLNhanVien createNhanVien(QLNhanVien qlnv) {
        var x = _InhanVienRepository.save(new NhanVien(qlnv.getMaNV(), qlnv.getTenNV(), qlnv.getGioiTinhNV(), qlnv.getNgaySinhNV(), qlnv.getSdtNV(), qlnv.getDiaChiNV(), qlnv.getImage(), null, null));
        return new QLNhanVien(x.getMaNV(), x.getTenNV(), x.getGioiTinhNV(), x.getNgaySinhNV(), x.getSdtNV(), x.getDiaChiNV(), x.getImage());
    }

    @Override
    public QLNhanVien updateNhanVien(QLNhanVien qlnv) {
        var x = _InhanVienRepository.save(new NhanVien(qlnv.getMaNV(), qlnv.getTenNV(), qlnv.getGioiTinhNV(), qlnv.getNgaySinhNV(), qlnv.getSdtNV(), qlnv.getDiaChiNV(), qlnv.getImage(), null, null));
        return new QLNhanVien(null, x.getTenNV(), x.getGioiTinhNV(), x.getNgaySinhNV(), x.getSdtNV(), x.getDiaChiNV(), x.getImage());
    }

    @Override
    public String deleteNhanVien(String maNV) {
        return _InhanVienRepository.deleteNhanVien(maNV);
    }

    @Override
    public List<QLNhanVien> getNhanVienByName(String tenNV) {
        listQLNV = new ArrayList<>();
        var nhanVien = _InhanVienRepository.getNhanVienByName(tenNV);
        for (NhanVien nv : nhanVien) {
            listQLNV.add(new QLNhanVien(nv.getMaNV(), nv.getTenNV(), nv.getGioiTinhNV(), nv.getNgaySinhNV(), nv.getSdtNV(), nv.getDiaChiNV(), nv.getImage()));
        }
        return listQLNV;
    }

    @Override
    public List<QLNhanVien> findNhanVienByName(String tenNV, String diaChiNV) {
        listQLNV = new ArrayList<>();
        var nhanVien = _InhanVienRepository.findNhanVienByName(tenNV, diaChiNV);
        for (NhanVien nv : nhanVien) {
            listQLNV.add(new QLNhanVien(nv.getMaNV(), nv.getTenNV(), nv.getGioiTinhNV(), nv.getNgaySinhNV(), nv.getSdtNV(), nv.getDiaChiNV(), nv.getImage()));
        }
        return listQLNV;
    }

    @Override
    public List<QLNhanVien> OrderNhanVienByMaNV() {
        listQLNV = new ArrayList<>();
        var nhanVien = _InhanVienRepository.OrderNhanVienByMaNV();
        for (NhanVien nv : nhanVien) {
            listQLNV.add(new QLNhanVien(nv.getMaNV(), nv.getTenNV(), nv.getGioiTinhNV(), nv.getNgaySinhNV(), nv.getSdtNV(), nv.getDiaChiNV(), nv.getImage()));
        }
        return listQLNV;
    }

    @Override
    public List<QLNhanVien> OrderNhanVienByName() {
        listQLNV = new ArrayList<>();
        var nhanVien = _InhanVienRepository.OrderNhanVienByName();
        for (NhanVien nv : nhanVien) {
            listQLNV.add(new QLNhanVien(nv.getMaNV(), nv.getTenNV(), nv.getGioiTinhNV(), nv.getNgaySinhNV(), nv.getSdtNV(), nv.getDiaChiNV(), nv.getImage()));
        }
        return listQLNV;
    }

    @Override
    public List<QLNhanVien> OrderNhanVienByDiaChi() {
        listQLNV = new ArrayList<>();
        var nhanVien = _InhanVienRepository.OrderNhanVienByDiaChi();
        for (NhanVien nv : nhanVien) {
            listQLNV.add(new QLNhanVien(nv.getMaNV(), nv.getTenNV(), nv.getGioiTinhNV(), nv.getNgaySinhNV(), nv.getSdtNV(), nv.getDiaChiNV(), nv.getImage()));
        }
        return listQLNV;
    }

    @Override
    public QLNhanVien getNhanVien(String tenNV) {
        var x = _InhanVienRepository.getNhanVien(tenNV);
        return new QLNhanVien(x.getMaNV(), x.getTenNV(), x.getGioiTinhNV(), x.getNgaySinhNV(), x.getSdtNV(), x.getDiaChiNV(), x.getImage());
    }

}
