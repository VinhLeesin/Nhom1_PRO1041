/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import domainmodel.dphong;
import java.util.List;
import viewmodel.vPhong;

/**
 *
 * @author MrpDuy
 */
public interface IPhong {
      public  List<vPhong> getAlldataPhong();
      public  List<dphong> getdatawhereTT(int tinhtrang);
       public int  themPhong(dphong p);
       public int  suaPhong(dphong p);
       public int  xoaPhong(dphong p);
       public int doitt(int tt,String map);
}
