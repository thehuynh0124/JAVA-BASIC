import tlu.khmt.A33047.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.lang.Math.*;
public class bai4 {
    public static void main(String[] args){
        Point<Integer> a = new Point<>(2, 2);
        Point<Integer> b = new Point<>(3, 3);
        Point<Integer> c = new Point<>(3, 5);
        Point<Integer> d = new Point<>(5, 3);
        Point<Integer> e = new Point<>(4, 4);
        Point<Integer> f = new Point<>(1, 1);
        Point<Integer> g = new Point<>(3, 5);

        Set<Point> hashSet = new HashSet<>();
        hashSet.add(a);
        hashSet.add(b);
        hashSet.add(c);
        hashSet.add(d);
        hashSet.add(e);
        hashSet.add(f);
        hashSet.add(g);
        for (Point valueSet : hashSet) System.out.print("(" + valueSet.getX() + "," + valueSet.getY() + ")   ");
        System.out.println();

        List<Point> check = new ArrayList<>();
        check.addAll(hashSet);
        int n = check.size();
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int z=j+1; z<n; z++){
                    if(baThangHang(check.get(i), check.get(j), check.get(z))){
                        System.out.print("(" + check.get(i).getX() + "," + check.get(i).getY() + ") ");
                        System.out.print("(" + check.get(j).getX() + "," + check.get(j).getY() + ") ");
                        System.out.println("(" + check.get(z).getX() + "," + check.get(z).getY() + ") là ba điểm thẳng hàng.");
                    }/*else {
                        System.out.print("(" + check.get(i).getX() + "," + check.get(i).getY() + "); ");
                        System.out.print("(" + check.get(j).getX() + "," + check.get(j).getY() + "); ");
                        System.out.println("(" + check.get(z).getX() + "," + check.get(z).getY() + ")");
                    }*/
                }
            }
        }

    }

    public static boolean baThangHang(Point<Integer> a, Point<Integer> b, Point<Integer> c){
        float d1 = (float) sqrt(pow(a.getX() - b.getX(), 2) + pow(a.getY() - b.getY(), 2)); // AB
        float d2 = (float) sqrt(pow(a.getX() - c.getX(), 2) + pow(a.getY() - c.getY(), 2)); // AC
        float d3 = (float) sqrt(pow(b.getX() - c.getX(), 2) + pow(b.getY() - c.getY(), 2)); // BC
        //System.out.println(d1 + " " + d2 + " " + d3);

        float f1 = (float) (d1+d2);
        float f2 = (float) (d1+d3);
        float f3 = (float) (d2+d3);
        //System.out.println(f1 + " " + f2 + " " + f3);

        return (f1==d3 || f2==d2 || f3==d1) ? true : false;
    }
}
