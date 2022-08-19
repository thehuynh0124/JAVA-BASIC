package Bai1;
import  java.util.ArrayList;
public class AlbumList {
    private ArrayList<Album> listAl;
    public AlbumList() {
        listAl = new ArrayList<Album>();
    }
    public void add(Album al){
        listAl.add(al);
    }
    public int size(){
        return listAl.size();
    }
    public Album get(int index){
        return listAl.get(index);
    }
}
