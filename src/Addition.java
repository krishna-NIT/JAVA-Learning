import java.util.Scanner;
public class Addition {
    Scanner scan = new Scanner(System.in);
    int a,b,c;
    public static int addm(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
    public static int mulm(int a,int b,int c){
        int mul = a*b*c;
        return mul;
    }

    public int getA() {
        a = scan.nextInt();
        return a;
    }

    public int getB() {
        b = scan.nextInt();
        return b;
    }

    public int getC() {
        c = scan.nextInt();
        return c;
    }

}
