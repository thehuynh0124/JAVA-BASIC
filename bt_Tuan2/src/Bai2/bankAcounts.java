package Bai2;
public class bankAcounts {
    private String AcountNum;
    private double soDu;
    private String CustName;
    private String Email;
    private String Sdt;
    public bankAcounts(String acountNum, double soDu, String custName, String email, String sdt){
        AcountNum = acountNum;
        this.soDu = soDu;
        CustName = custName;
        Email = email;
        Sdt = sdt;
    }
    public String getAcountNum(){
        return AcountNum;
    }
    public void setAcountNum(String acountNum){
        AcountNum = acountNum;
    }
    public double getSoDu() {
        return soDu;
    }

    public void setSoDu(Double soDu) {
        this.soDu = soDu;
    }
    public String getCustName(){
        return CustName;
    }
    public void setCustName(String custName){
        CustName = custName;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public String getSdt() {
        return Sdt;
    }
    public void setSdt(String sdt) {
        Sdt = sdt;
    }
    public void napTien(int a){
        soDu += a;
        System.out.println("bạn vừa nạp " + a + " vào tài khoản");
        System.out.println("số dư hiện tại là " + soDu);
    }
    public void rutTien(int a){
        if(a>soDu){
            System.out.println("số dư không khả dụng");
        }
        else{
            soDu -= a;
            System.out.println("bạn vừa rút " + a + " từ tài khoản");
            System.out.println("số dư hiện tại là " + soDu);
        }
    }


}
