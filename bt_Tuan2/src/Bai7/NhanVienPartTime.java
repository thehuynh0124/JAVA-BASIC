package Bai7;

public class NhanVienPartTime extends NhanVien{
    private int gioCong;
    public NhanVienPartTime(String name, int gioCong){
        super(name);
        this.gioCong = gioCong;
    }
    public NhanVienPartTime() {
        this("", 0);
    }
    public int getGioCong(){
        return gioCong;
    }
    public void setGioCong(int gioCong){
        this.gioCong = gioCong;
    }
    @Override
    public int tinhLuong(){
        return gioCong *40000;
    }
}
