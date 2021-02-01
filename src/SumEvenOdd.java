import java.util.Scanner;

public class SumEvenOdd{

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sumeven = 0;
        int sumodd = 0;
        int digit = 0;
        while (n != 0) {
            // num = num/10
            n /= 10;
            ++digit;
        }

//
//
//        int a;
//       // if (a%2 ==0){
//            sumeven += a;
//        }else {
//            sumodd += a;
//        }
//
//
//        System.out.println(sumeven+" "+sumodd);
//    }
    }}



