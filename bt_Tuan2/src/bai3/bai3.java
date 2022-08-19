package bai3;

public class bai3 {
    public static void main (String[] args){
        double a;
        Point DiemA =new Point(1,2);
        Point DiemB= new Point(5,6);

        System.out.println("Khoảng cách đến gốc tọa độ là : " +DiemA.khoangCach());
        System.out.println("Khoảng cách đến tọa độ A(x,y) là : " +DiemA.khoangCach(7,8));
        System.out.println("Khoảng cách đến tọa độ điểm B là  : " +DiemA.khoangCach(DiemB));


    }
}
