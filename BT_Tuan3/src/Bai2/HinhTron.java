package Bai2;

public class HinhTron implements IHinh {
    private double banKinh;
    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }
    public double getBanKinh() { return banKinh; }
    public void setBanKinh(double banKinh) { this.banKinh = banKinh; }
    @Override
    public double chuVi(){ return banKinh*2*Math.PI; }
    public double dienTich(){ return banKinh * banKinh * Math.PI; }
    public void show(){
        System.out.println("Chu vi: " + chuVi());
        System.out.println("Diện tích: " + dienTich());
    }
}
