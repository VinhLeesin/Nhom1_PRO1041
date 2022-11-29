/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodel.dKhachhang;
import java.util.List;

/**
 *
 * @author MrpDuy
 */
public interface IKhachhang {
    public  List<dKhachhang> getAlldataKH();
    public  List<dKhachhang> timkiem(String tenkh);
}
