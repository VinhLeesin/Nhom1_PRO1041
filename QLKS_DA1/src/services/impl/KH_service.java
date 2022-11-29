/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodel.dKhachhang;
import java.util.List;
import repositories.KH_repository;


import domainmodel.dKhachhang;
import java.util.List;
import repositories.KH_repository;

/**
 *
 * @author MrpDuy
 */
public class KH_service implements services.IKhachhang{

    @Override
    public List<dKhachhang> getAlldataKH() {
        return KH_repository.getAlldataKH();
    }

    @Override
    public List<dKhachhang> timkiem(String tenkh) {
        return KH_repository.timkiem(tenkh);
    }
    
}
