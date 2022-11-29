/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author MrpDuy
 */
public class dDichvuCT {
    private int iddv;
    private int iddp;
    private String madv;
    private double dongia;
    private int soluong;
    private double thanhtien;

    public dDichvuCT() {
    }

    public dDichvuCT(int iddv, int iddp, String madv, double dongia, int soluong, double thanhtien) {
        this.iddv = iddv;
        this.iddp = iddp;
        this.madv = madv;
        this.dongia = dongia;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public int getIddv() {
        return iddv;
    }

    public void setIddv(int iddv) {
        this.iddv = iddv;
    }

    public int getIddp() {
        return iddp;
    }

    public void setIddp(int iddp) {
        this.iddp = iddp;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
