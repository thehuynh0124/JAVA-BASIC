package Bai6;

public class HinhLapPhuong extends HinhChuNhat{
    private double chieuCao;
    public HinhLapPhuong(double chieudai, double chieurong, double chieuCao) {
        super(chieudai, chieurong);
        if(chieuCao<0){
            chieuCao=0;
        }
        this.chieuCao = chieuCao;
    }
    public double getChieuCao() {
        return chieuCao;
    }
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double theTichLapPhuong(){
        return dientich()* chieuCao;
    }
}
