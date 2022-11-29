/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.Impl;

import domainmodel.LoaiKH;
import java.util.ArrayList;
import repositories.LoaiKhachHangRepository;
import services.LoaiKHService;
import viewmodel.QlyLoaiKH;

/**
 *
 * @author FPTSHOP
 */
public class LoaiKHServiceImpl implements LoaiKHService{
    private LoaiKhachHangRepository loaiKhachHangRepository = new LoaiKhachHangRepository();

    @Override
    public ArrayList<QlyLoaiKH> getListLoaiKH() {
        return loaiKhachHangRepository.getListLoaiFromDB();
    }

    @Override
    public String insert(LoaiKH kh) {
        if(loaiKhachHangRepository.insert(kh) == true){
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(String id, LoaiKH kh) {
        if(loaiKhachHangRepository.update(id, kh) == true){
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(String id) {
        if(loaiKhachHangRepository.delete(id) == true) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }
    
    
}
