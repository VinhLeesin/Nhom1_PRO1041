package viewmodel;

public class DichVu {

    private String madv;
    private String tendvl;
    private String donvi;
    private double dongia;
    private String ghiChu;

    public DichVu() {
    }

    public DichVu(String madv, String tendvl, String donvi, double dongia, String ghiChu) {
        this.madv = madv;
        this.tendvl = tendvl;
        this.donvi = donvi;
        this.dongia = dongia;
        this.ghiChu = ghiChu;
    }
    

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getTendvl() {
        return tendvl;
    }

    public void setTendvl(String tendvl) {
        this.tendvl = tendvl;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    
    
}
