package Bai1;

import java.time.Year;

public class SinhVien {

    private String MSV;
    private String Name;
    private int BirthYear;
    private double DiemJava;
    public SinhVien(String msv, String name, int birthYear, double diemJava){
        MSV = msv;
        Name = name;
        BirthYear = birthYear;
        this.DiemJava = diemJava;
    }
    public String getMSV(){
        return MSV;
    }
    public void setMSV(String msv){
        MSV = msv;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    public int getBirthYear(){
        return BirthYear;
    }
    public void setBirthYear(int birthYear){
        BirthYear = birthYear;
    }
    public double getDiemJava(){
        return DiemJava;
    }
    public void setDiemJava(double diemJava){
        this.DiemJava = diemJava;
    }
    public int tuoi(){
        return 2021 - BirthYear;
    }
    public void Hienthithongtin(){
        System.out.println("Sinh viên "+ Name +", " + tuoi()+"tuổi , có mã sinh viên là: "+MSV +", đạt "+ DiemJava+" điểm Java");
    }

}

