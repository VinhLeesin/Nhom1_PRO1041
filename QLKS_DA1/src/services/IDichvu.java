/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import java.util.ArrayList;
import viewmodel.DichVu;

/**
 *
 * @author MrpDuy
 */
public interface IDichvu {
    public  ArrayList<DichVu> getAllList ();
    public  ArrayList<DichVu> timKiem (String ten);
    public  int them (DichVu dv);
    public  int sua (DichVu dv);
    public  int xoa (String ma);
}