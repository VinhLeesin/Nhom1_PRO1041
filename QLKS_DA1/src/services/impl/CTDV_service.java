/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodel.dDichvuCT;
import java.util.List;
import repositories.CTDichvu_repository;
import services.ICTDVu;

/**
 *
 * @author MrpDuy
 */
public class CTDV_service implements ICTDVu{

    @Override
    public int insert(dDichvuCT dv) {
       return CTDichvu_repository.insert(dv);
    }

    @Override
    public int delete(String idct) {
    return CTDichvu_repository.delete(idct);   
    }

    @Override
    public List<dDichvuCT> getAlldata() {
    return CTDichvu_repository.getAlldata();
    }

    @Override
    public List<dDichvuCT> getdvgtheoma(int MaDatPhong) {
    return CTDichvu_repository.getdvgtheoma(MaDatPhong);
    }
    
}
