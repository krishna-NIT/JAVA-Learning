import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Circle {
double radius;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r= scan.nextInt();
        int[] arr = new int[r];
        for (int i =0;i<r;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        addToArrayForm(arr,k);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        int actualn = 0;
        int pow = num.length-1;
        int i = 0;
        while (pow>=0){
            actualn += (num[i]*Math.pow(10,pow));
            i++;
            pow--;
        }
        System.out.println(actualn);
        int finaln = actualn + k;
        System.out.println(finaln);
        List<Integer> lsfinal = new Stack<Integer>();
        while (finaln > 0){
            int rem = finaln % 10;
            finaln /= 10;
            lsfinal.add(rem);
        }
        System.out.println(lsfinal);
        List<Integer> lsf = new LinkedList<Integer>();
        int j = lsfinal.size()-1;
        while (j>=0) {
            lsf.add(lsfinal.remove(j));
            j--;
        }
        System.out.println(lsf);
        return lsf;
    }

    public static boolean isPalindrome(int x) {
        if (x <0){
            return false;
        }
        LinkedList<Integer> ls = new LinkedList<Integer>();
        while (x>0){
            int temp = x%10;
            x /= 10;
            ls.add(temp);
        }
        System.out.println(ls);
        int lasti = ls.size()-1;
        int starti = 0;
        while (lasti>starti){
            if (ls.get(lasti) != ls.get(starti)){
                return false;
            }
            lasti--;
            starti++;
        }
        return true;
    }

public Circle(double radius){
    if (radius<0){
        radius =0;
        this.radius = radius;
    }else {
        this.radius = radius;
    }
}

public double getRadius(){
    return this.radius;
}
public double getArea(){
    return (getRadius()*getRadius()*Math.PI);
}

}
