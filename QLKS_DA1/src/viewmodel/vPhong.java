/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

import domainmodel.dloaiphong;

/**
 *
 * @author MrpDuy
 */
    public class vPhong {
    private String map;
    private String maloaip;
    private int dientich;
    private int mat;
    private String hinh ;
    private int ttrang ;
    private String gchu ;
    private dloaiphong loaip;

    public vPhong() {
    }

    public vPhong(String map, String maloaip, int dientich, int mat, String hinh, int ttrang, String gchu, dloaiphong loaip) {
        this.map = map;
        this.maloaip = maloaip;
        this.dientich = dientich;
        this.mat = mat;
        this.hinh = hinh;
        this.ttrang = ttrang;
        this.gchu = gchu;
        this.loaip = loaip;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getMaloaip() {
        return maloaip;
    }

    public void setMaloaip(String maloaip) {
        this.maloaip = maloaip;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getTtrang() {
        return ttrang;
    }

    public void setTtrang(int ttrang) {
        this.ttrang = ttrang;
    }

    public String getGchu() {
        return gchu;
    }

    public void setGchu(String gchu) {
        this.gchu = gchu;
    }

    public dloaiphong getLoaip() {
        return loaip;
    }

    public void setLoaip(dloaiphong loaip) {
        this.loaip = loaip;
    }

   public String tinhtrag(){
      String a;
      if (ttrang==0) {
          a="Sẵn sàng";
      } else if(ttrang==1){
      a="Dọn dẹp";
      }else if(ttrang==2){
      a="Đang sử dụng";
      }else{
      a="Đặt trước";
      }
  return a;
  }

    

   
}
