package tlu.khmt.A33047;

public class SinhVien implements Comparable<SinhVien> {
        private String MSV;
        private String hoTen;
        private double diemTN;

        public SinhVien(String MSV, String hoTen, double diemTN) {
            this.MSV = MSV;
            this.hoTen = hoTen;
            this.diemTN = diemTN;
        }

        public String getMaSV() { return MSV; }
        public void setMaSV(String maSV) { this.MSV = maSV; }

        public String getHoTen() { return hoTen; }
        public void setHoTen(String hoTen) { this.hoTen = hoTen; }

        public double getDiemTN() { return diemTN; }
        public void setDiemTN(double diemTN) { this.diemTN = diemTN; }

        @Override
        public boolean equals(Object obj){
            if(obj instanceof SinhVien){
                SinhVien another = (SinhVien) obj;
                if(this.MSV.equals(another.MSV)){
                    //if(this.diemTN == another.diemTN){
                    return true;
                }
            }
            return false;
        }

        @Override
        public int hashCode(){
            int result;
            result = MSV.hashCode();
            //result = maSV.hashCode() + hoTen.hashCode() + Double.valueOf(diemTN).hashCode();
            return result;
        }

        @Override
        public int compareTo(SinhVien obj) {

            if(!obj.MSV.equals(this.MSV)) {
                if (this.diemTN > obj.diemTN) {
                    return -1;
                }
                if (this.diemTN < obj.diemTN || this.diemTN == obj.diemTN) {
                    return 1;
                }
            }
            return 0;
        }
}
