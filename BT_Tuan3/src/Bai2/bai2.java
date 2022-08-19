package Bai2;
import java.util.ArrayList;

public class bai2 {
    public static void main(String[] args){
        ArrayList<IHinh> arrayList = new ArrayList<IHinh>();

        IHinh hinhChuNhat = new HinhChuNhat(15, 10);
        IHinh hinhTron = new HinhTron(10);

        arrayList.add(hinhChuNhat);
        arrayList.add(hinhTron);

        for(IHinh value : arrayList){ value.show(); }
    }
}
