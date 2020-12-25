public class HelloWorld {
    public static void main(String[] args) {
        double doublevar = 22.85;
        double doublevar2 = 80.00;
        double p = (doublevar+doublevar2)*100.00;
        double rem = p % (40.00);

        boolean val = (rem == 0) ? true : false;

        System.out.println(val);
        if(val != true){
            System.out.println("Got some Reminder");
        }
    }
}


