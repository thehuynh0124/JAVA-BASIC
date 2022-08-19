package Bai6;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public double getChieuDai() {
        return chieuDai;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double getChieuRong() {
        return chieuRong;
    }
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public HinhChuNhat(double chieudai, double chieurong) {
        if(chieudai<0 | chieurong<0){
            chieudai=0;
            chieurong=0;
        }
        this.chieuDai = chieudai;
        this.chieuRong = chieurong;
    }
    public double dientich(){
        return chieuDai * chieuRong;
    }
}
