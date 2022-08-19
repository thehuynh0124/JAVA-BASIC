package Bai7;

public class NhanVienFullTime extends NhanVien {
    private int ngayCong;
    public NhanVienFullTime(String name,int ngayCong) {
        super(name);
        this.ngayCong = ngayCong;
    }
    public NhanVienFullTime () {
        this("",0);
    }
    public int getngayCong() {
        return ngayCong;
    }
    public void setngayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }
    @Override
    public int tinhLuong() {
        return ngayCong * 500000;
    }
}
