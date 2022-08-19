package Bai5;

public class HinhTruTron extends HinhTron{
    private double chieuCao;
    public HinhTruTron(double bankinh, double chieucao) {
        super(bankinh);
        if(chieucao<0){
            chieucao=0;
        }
        this.chieuCao = chieucao;
    }
    public double getChieucao() {
        return chieuCao;
    }
    public void setChieucao(double chieucao) {
        this.chieuCao = chieucao;
    }
    public double theTich(){
        return dienTichHinhTron()*chieuCao;
    }
}
