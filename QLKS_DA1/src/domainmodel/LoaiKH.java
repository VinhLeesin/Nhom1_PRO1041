/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author FPTSHOP
 */
public class LoaiKH {
    
    private String maLoaiKH;
    private String tenLoaiKH;
    private int tienGiam;
    private String moTa;

    public LoaiKH() {
    }

    public LoaiKH(String maLoaiKH, String tenLoaiKH, int tienGiam, String moTa) {
        this.maLoaiKH = maLoaiKH;
        this.tenLoaiKH = tenLoaiKH;
        this.tienGiam = tienGiam;
        this.moTa = moTa;
    }

    public String getMaLoaiKH() {
        return maLoaiKH;
    }

    public void setMaLoaiKH(String maLoaiKH) {
        this.maLoaiKH = maLoaiKH;
    }

    public String getTenLoaiKH() {
        return tenLoaiKH;
    }

    public void setTenLoaiKH(String tenLoaiKH) {
        this.tenLoaiKH = tenLoaiKH;
    }

    public int getTienGiam() {
        return tienGiam;
    }

    public void setTienGiam(int tienGiam) {
        this.tienGiam = tienGiam;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "LoaiKH{" + "maLoaiKH=" + maLoaiKH + ", tenLoaiKH=" + tenLoaiKH + ", tienGiam=" + tienGiam + ", moTa=" + moTa + '}';
    }
    
    public static void main(String[] args) {
        System.out.println();
    }
    
}
