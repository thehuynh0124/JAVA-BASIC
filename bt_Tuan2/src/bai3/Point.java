package bai3;

public class Point {
    private int x;
    private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double khoangCach(){
        return Math.sqrt(x*x+y*y);
    }
    public double khoangCach(int x,int y){
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));

    }
    public double khoangCach(Point diem){
        return Math.sqrt(Math.pow(diem.x-this.x,2)+Math.pow(diem.y-this.y,2));
    }
}
