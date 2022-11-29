/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services.impl;

import domainmodel.dloaiphong;
import java.util.List;
import repositories.LoaiP_repository;
import services.ILoaiphong;

/**
 *
 * @author MrpDuy
 */
public class Lphong_service implements ILoaiphong{

    @Override
    public List<dloaiphong> getAlldataKH() {
    return LoaiP_repository.getAlldataloaiP();
    }
    
}
