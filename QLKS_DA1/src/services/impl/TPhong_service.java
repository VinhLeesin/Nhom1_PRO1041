/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodel.dthuephong;
import java.util.List;
import repositories.Thuephong_repository;
import services.Ithuephong;

/**
 *
 * @author MrpDuy
 */
public class TPhong_service implements Ithuephong{

    @Override
    public List<dthuephong> getAlldata() {
        return Thuephong_repository.getAlldata();
    }

    @Override
    public List<dthuephong> phongchuatt() {
    return Thuephong_repository.phongchuatt();
    }

    @Override
    public int themthuep(dthuephong tp) {
    return Thuephong_repository.themthuep(tp);
    }

    @Override
    public int suathuep(dthuephong tp) {
    return Thuephong_repository.suathuep(tp);
    }

    @Override
    public int thanhtoan(String map) {
    return Thuephong_repository.thanhtoan(map);
    }

    @Override
    public dthuephong getphongtheoma(String maphong) {
    return Thuephong_repository.getphongtheoma(maphong);
    }
    
}
