package Bai8;
import java.util.Random;
public class SoNgauNhien {
    private int SoNgauNhien;
    public static int count;

    public SoNgauNhien() {
        Random rand = new Random();
        this.SoNgauNhien = rand.nextInt(100)+1;
        count++;
    }
    public int getSoNgauNhien() {
        return SoNgauNhien;
    }
    public void setSoNgauNhien(int soNgauNhien) {
        this.SoNgauNhien = soNgauNhien;
    }
    public int getCount(){
        return count;
    }
}
