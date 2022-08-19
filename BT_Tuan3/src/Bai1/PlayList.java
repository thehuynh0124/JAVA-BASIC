package Bai1;
import java.util.LinkedList;

public class PlayList {
    private LinkedList<BaiHat> playList;
    public PlayList(){
        playList = new LinkedList<BaiHat>();
    }
    public void add(BaiHat baiHat, AlbumList albumList){
        for(int i=0; i<albumList.size(); i++){
            Album album = albumList.get(i);
            for(int j=0; j<album.size(); j++) {
                if(baiHat.equal(album.get(j))){
                    playList.push(baiHat);
                    break;
                }
            }
        }
    }
}
