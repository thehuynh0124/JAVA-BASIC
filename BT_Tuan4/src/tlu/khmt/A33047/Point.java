package tlu.khmt.A33047;

public class Point<T> {
        private T x;
        private T y;
        public Point(T x, T y) {
            this.x = x;
            this.y = y;
        }
        public T getX() { return x; }
        public void setX(T x) { this.x = x; }
        public T getY() { return y; }
        public void setY(T y) { this.y = y; }
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Point){
                Point another = (Point) obj;
                if(this.x.equals(another.x) && this.y.equals(another.y)){
                    //if(this.diemTN == another.diemTN){
                    return true;
                }
            }
            return false;
        }
        @Override
        public int hashCode(){
            int result;
            result = x.hashCode() + y.hashCode();
            //result = maSV.hashCode() + hoTen.hashCode() + Double.valueOf(diemTN).hashCode();
            return result;
        }
}
