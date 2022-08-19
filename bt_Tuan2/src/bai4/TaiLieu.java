package bai4;

public class TaiLieu extends TacGia{
    private String Tentailieu;
    private int Namxuatban;
    public TaiLieu(String name, String birthYear, String tentailieu, int namxuatban) {
        super(name, birthYear);
        Tentailieu = tentailieu;
        Namxuatban = namxuatban;
    }
    public String getTentailieu() {
        return Tentailieu;
    }
    public void setTentailieu(String tentailieu) {
        Tentailieu = tentailieu;
    }
    public int getNamxuatban() {
        return Namxuatban;
    }
    public void setNamxuatban(int namxuatban) {
        Namxuatban = namxuatban;
    }
    public void Hienthithongtin(){
        System.out.println("Tài liệu : "+ Tentailieu);
        System.out.println("Tác Giả : "+ getName());
        System.out.println("Được xuất bản vào năm : " + Namxuatban);
    }

}
