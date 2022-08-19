package Bai7;

public class NhanVien {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public NhanVien() {
        this("");
    }
    public NhanVien(String name) {
        this.name =name;
    }
    public int tinhLuong() {
        return 0;
    }
}
