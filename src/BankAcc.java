public class BankAcc {
    // fields Creating
    private long AccNo;
    private int Bal;
    private String CName;
    private String Cemail;
    private long MobNo;

    // Creating Getters
    public long getAccNo() {
        return AccNo;
    }

    public int getBal() {
        return Bal;
    }

    public String getCName() {
        return CName;
    }

    public String getCemail() {
        return Cemail;
    }

    public long getMobNo() {
        return MobNo;
    }

    // Creating Setters
    public void setAccNo(long accno) {
        AccNo = accno;
    }
////////////////////////////this isliye use karte hai //////////////////
    public void setBal(int Bal) {
        this.Bal = Bal;
    }

    public void setCemail(String cemail) {
        Cemail = cemail;
    }

    public void setCName(String cname) {
        CName = cname;
    }

    public void setMobNo(long mobNo) {
        MobNo = mobNo;
    }
//Additiional Method

    public int deposit(int dep) {
        Bal += dep;
        return Bal;
    }

    private int withdrawal(int withdra) {
        if (withdra <= Bal) {
            Bal -= withdra;
            return Bal;
        } else {
            System.out.println("Insufficient Funds");
            return -1;
        }
    }

    public static void main(String[] args){
    BankAcc krish = new BankAcc();

  ///////////////////// iske jaghaha parameteried constructor used kar leta //////////////
    krish.setAccNo(39421900164L);
    krish.setBal(1500);
    krish.setCemail("krish30jan@gmail.com");
    krish.setMobNo(8742881915L);
    krish.setCName("ShriKrushna Gajanan Bhagwat");

        System.out.println("Enter Balance of "+krish.getCName()+" is "+krish.getBal());
    krish.deposit(500);
        System.out.println("Enter Balance of "+krish.getCName()+" is "+krish.getBal());
    krish.withdrawal(200);
        System.out.println("Enter Balance of "+krish.getCName()+" is "+krish.getBal());
    krish.withdrawal(2000);
        System.out.println("Enter Balance of "+krish.getCName()+" is "+krish.getBal());
////////another way to print by using getter
        System.out.println(krish.getMobNo());
    }

}


