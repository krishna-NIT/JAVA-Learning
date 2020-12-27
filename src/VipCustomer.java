public class VipCustomer {
//fields Initialization
    private String name;
    private long creditLimit;
    private String email;
//1st constructor
    public VipCustomer(){
        this("Default Name",500000,"Default Email");
    }
//2nd Constructor
    public VipCustomer(String name, long creditLimit, String email){
    this.name = name;
    this.creditLimit = creditLimit;
    this.email=email;
    }

//3rd Constructor
    public VipCustomer(String name, long creditLimit){
        this.name = name;
        this.creditLimit = creditLimit;
    }
//Getter
    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
//Main Method
    public static void main(String[] args){
        System.out.println("Hello Welcome");
        VipCustomer per1 = new VipCustomer("krishna",5000000,"bhagwak266@gmail.com");
        VipCustomer per2 = new VipCustomer("Vishnu",100000);
        System.out.println(per1.getCreditLimit() + " "+per1.getName());
        System.out.println(per2.getCreditLimit());

    }
}
