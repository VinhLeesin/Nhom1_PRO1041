/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodel.KhachHang;
import domainmodel.LoaiKH;
import java.util.ArrayList;
import viewmodel.KhachHangModel;

/**
 *
 * @author FPTSHOP
 */
public interface KhachHangService {
    public ArrayList<KhachHangModel> getList();
    public ArrayList<LoaiKH> getLoai();
    public String add(KhachHang kh);
    public String update(String id, KhachHang kh);
    public String delete(String id);
    public ArrayList<KhachHangModel> search(String id);
}
