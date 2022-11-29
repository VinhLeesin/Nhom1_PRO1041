/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodel.LoaiKH;
import java.util.ArrayList;
import viewmodel.QlyLoaiKH;

/**
 *
 * @author FPTSHOP
 */
public interface LoaiKHService {
    public ArrayList<QlyLoaiKH> getListLoaiKH();
    public String insert(LoaiKH kh);
    public String update(String id, LoaiKH kh);
    public String delete(String id);
}
