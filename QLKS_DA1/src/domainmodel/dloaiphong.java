/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

/**
 *
 * @author MrpDuy
 */
public class dloaiphong {
    private String mLoai;
    private String tenLoai;
    private int gDon; 
    private int gDoi; 
    private Double gGio; 
    private Double gNgay; 

    public dloaiphong() {
    }

    public dloaiphong(String mLoai, String tenLoai, int gDon, int gDoi, Double gGio, Double gNgay) {
        this.mLoai = mLoai;
        this.tenLoai = tenLoai;
        this.gDon = gDon;
        this.gDoi = gDoi;
        this.gGio = gGio;
        this.gNgay = gNgay;
    }

    public dloaiphong(String ten, Double gGio, Double gNgay) {
        this.tenLoai = ten;
        this.gGio = gGio;
        this.gNgay = gNgay;
    }

    public String getmLoai() {
        return mLoai;
    }

    public void setmLoai(String mLoai) {
        this.mLoai = mLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public int getgDon() {
        return gDon;
    }

    public void setgDon(int gDon) {
        this.gDon = gDon;
    }

    public int getgDoi() {
        return gDoi;
    }

    public void setgDoi(int gDoi) {
        this.gDoi = gDoi;
    }

    public Double getgGio() {
        return gGio;
    }

    public void setgGio(Double gGio) {
        this.gGio = gGio;
    }

    public Double getgNgay() {
        return gNgay;
    }

    public void setgNgay(Double gNgay) {
        this.gNgay = gNgay;
    }
    
}
