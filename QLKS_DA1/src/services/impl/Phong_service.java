/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodel.dphong;
import java.util.ArrayList;
import java.util.List;
import services.IPhong;
import repositories.Phong_repository;
import viewmodel.vPhong;
/**
 *
 * @author MrpDuy
 */
public class Phong_service implements IPhong{
    private Phong_repository pRepo;

    public Phong_service() {
        this.pRepo = new Phong_repository();
    }

    @Override
    public List<vPhong> getAlldataPhong() {
        List<vPhong> LQLCH = new ArrayList<>();
        List<dphong> LCH = this.pRepo.getAlldata();
        for (dphong dmodel : LCH) {
            vPhong vmodel = new vPhong(dmodel.getMap(),dmodel.getMaloaip(),
                    dmodel.getDientich(),dmodel.getMat(),
                    dmodel.getHinh(),dmodel.getTtrang(),dmodel.getGchu(),dmodel.getLoaip());
            LQLCH.add(vmodel);
        }
        return LQLCH;
    }

    @Override
    public List<dphong> getdatawhereTT(int tinhtrang) {
    return pRepo.getdatawhereTT(tinhtrang);
    }

    @Override
    public int themPhong(dphong p) {
    return  pRepo.themCH(p);
    }

    @Override
    public int suaPhong(dphong p) {
        return  pRepo.suaCH(p);}

    @Override
    public int xoaPhong(dphong p) {
       return  pRepo.xoaCH(p);}

    @Override
    public int doitt( int tt,String map) {
        return pRepo.doitt(tt,map);
    }



    
}
