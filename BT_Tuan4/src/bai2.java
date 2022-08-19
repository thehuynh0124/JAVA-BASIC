import tlu.khmt.A33047.SinhVien;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class bai2 {
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien("123", "vu van A", 9.5);
        SinhVien sv2 = new SinhVien("231", "tran van b", 9);
        SinhVien sv3 = new SinhVien("222", "pham van c", 8);
        SinhVien sv4 = new SinhVien("132", "nguyen van d", 9.5);
        SinhVien sv5 = new SinhVien("999", "le thi e", 8.3);
        SinhVien sv6 = new SinhVien("101", "trinh thi t", 8.3);

        Set<SinhVien> treeSet = new TreeSet<>();
        treeSet.add(sv1);
        treeSet.add(sv2);
        treeSet.add(sv3);
        treeSet.add(sv4);
        treeSet.add(sv5);
        treeSet.add(sv6);

        /*for (SinhVien valueSet : treeSet) {
            System.out.println(valueSet.getMaSV() + "  " + valueSet.getHoTen() + "  " + valueSet.getDiemTN());
        }*/
        List<SinhVien> top3 = new ArrayList<>();

        top3.addAll(treeSet);

        System.out.println(top3.get(0).getMaSV() + "  " + top3.get(0).getHoTen() + "  " + top3.get(0).getDiemTN());
        System.out.println(top3.get(1).getMaSV() + "  " + top3.get(1).getHoTen() + "  " + top3.get(1).getDiemTN());
        System.out.println(top3.get(2).getMaSV() + "  " + top3.get(2).getHoTen() + "  " + top3.get(2).getDiemTN());
    }
}