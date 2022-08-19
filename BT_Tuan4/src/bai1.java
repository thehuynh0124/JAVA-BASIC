import tlu.khmt.A33047.SinhVien;
import java.util.HashSet;
import java.util.Set;
public class bai1 {
    public static void main(String[] args){
        SinhVien sv1 = new SinhVien("123", "vu van A", 10);
        SinhVien sv2 = new SinhVien("456", "tran van b", 9.5);
        SinhVien sv3 = new SinhVien("222", "pham thi c", 8);
        SinhVien sv4 = new SinhVien("123", "vu van A", 8);

        Set<SinhVien> hashSet = new HashSet<>();
        hashSet.add(sv1);
        hashSet.add(sv2);
        hashSet.add(sv3);
        hashSet.add(sv4);

        for (SinhVien valueSet : hashSet) {
            System.out.println(valueSet.getMaSV() + "  " + valueSet.getHoTen() + "  " + valueSet.getDiemTN());
        }
    }
}
