package Bai5;

public class HinhTron {
    private double BanKinh;
    public HinhTron(double bankinh) {
        if(bankinh<0){
            bankinh=0;
        }
        BanKinh = bankinh;
    }
    public double getBanKinh() {
        return BanKinh;
    }
    public void setBanKinh(double bankinh) {
        BanKinh = bankinh;
    }
    public double dienTichHinhTron(){
        return Math.PI*Math.pow(BanKinh,2);

    }
}
