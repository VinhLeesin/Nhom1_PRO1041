/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodel.dDichvuCT;
import java.util.List;

/**
 *
 * @author MrpDuy
 */
public interface ICTDVu {
    public int insert(dDichvuCT dv);
    public  int delete(String idct);
    public  List<dDichvuCT> getAlldata();
    public  List<dDichvuCT> getdvgtheoma(int MaDatPhong);
}
