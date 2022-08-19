package Bai2;

public class HinhChuNhat implements IHinh{
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat(double chieuDai, double chieuRong){
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
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

    @Override
    public double chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    public double dienTich(){
        return chieuDai*chieuRong;
    }
    public void show(){
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Diện tích: " + dienTich());
    }
}
