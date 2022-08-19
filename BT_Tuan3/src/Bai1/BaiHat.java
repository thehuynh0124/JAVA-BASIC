package Bai1;

public class BaiHat {
    private String tieuDe;
    private int thoiLuong;

    public BaiHat(String tieuDe, int thoiLuong) {
        this.tieuDe = tieuDe;
        this.thoiLuong = thoiLuong;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public int getThoiLuong() {
        return thoiLuong;
    }
    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public boolean equal(BaiHat baiHat){
        return this.getThoiLuong() == baiHat.getThoiLuong();
    }
}
