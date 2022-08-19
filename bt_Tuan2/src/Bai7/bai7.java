package Bai7;

import java.util.Scanner;
import java.util.Random;

public class bai7 {
    public static void main(String[] args) {
        NhanVien[] nv =new NhanVien[5];
        for(int i=0;i<5;i++){
            Scanner sr = new Scanner(System.in);
            Random rand = new Random();
            Random ngayCong = new Random();
            Random gioCong = new Random();
            if((rand.nextInt(100)+1)%2!=0){
                nv[i]=new NhanVienFullTime(sr.nextLine(), ngayCong.nextInt(10)+15);
            }
            else{
                nv[i]=new NhanVienPartTime(sr.nextLine(),gioCong.nextInt(120)+80);
            }
        }
        for(int i=0;i<nv.length;i++){
            System.out.println("Nhân viên " + nv[i].getName() + " có lương là :" + nv[i].tinhLuong());
        }
    }
}
