/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.Impl;

import domainmodel.KhachHang;
import domainmodel.LoaiKH;
import java.util.ArrayList;
import repositories.KhachHangRepository;
import services.KhachHangService;
import utilities.D_CHECK;
import viewmodel.KhachHangModel;

/**
 *
 * @author FPTSHOP
 */
public class KhachHangServiceImpl implements KhachHangService{
    
    private KhachHangRepository khachHangRepo = new KhachHangRepository();
    private D_CHECK check = new D_CHECK();

    @Override
    public ArrayList<KhachHangModel> getList() {
        return khachHangRepo.getListFromDb();
    }

    @Override
    public ArrayList<LoaiKH> getLoai() {
        return khachHangRepo.getMaLoaiKH();
    }

    @Override
    public String add(KhachHang kh) {
        
        if(khachHangRepo.insert(kh) == true){
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(String id, KhachHang kh) {
        if(khachHangRepo.update(id, kh) == true){
            return "Update thành công";
        } else {
            return "Update thất bại";
        }
    }

    @Override
    public String delete(String id) {
        if(khachHangRepo.delete(id) == true){
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public ArrayList<KhachHangModel> search(String id) {
        return khachHangRepo.timKiem(id);
    }
    
}
