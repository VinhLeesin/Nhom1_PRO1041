/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import java.util.ArrayList;
import viewmodel.DichVu;
import repositories.DichVu_Repository;
import services.IDichvu;


public class DichVu_Service implements IDichvu {
    public  ArrayList<DichVu> getAllList (){
    return DichVu_Repository.AllDichVu();
    }
    public  ArrayList<DichVu> timKiem (String ten){
    return DichVu_Repository.Tim(ten);
    }
    public  int them (DichVu dv){
    return DichVu_Repository.ThemDV(dv);
    }
    public  int sua (DichVu dv){
    return DichVu_Repository.SuaDV(dv);
    }
    public  int xoa (String ma){
    return DichVu_Repository.XoaDV(ma);
    }
}

