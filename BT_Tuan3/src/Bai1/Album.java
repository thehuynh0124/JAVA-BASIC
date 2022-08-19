package Bai1;
import  java.util.ArrayList;
public class Album {
    private ArrayList<BaiHat> listBH;
    public Album() {
        listBH = new ArrayList<BaiHat>();
    }
    public void add(BaiHat baiHat){
        listBH.add(baiHat);
    }
    public int size(){
        return listBH.size();
    }
    public BaiHat get(int index){
        return listBH.get(index);
    }
}
