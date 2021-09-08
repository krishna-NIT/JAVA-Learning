import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Circle {
    double radius;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        mean(arr);

        //  Sorting of array -> Ascending order
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//        System.out.println();
//        System.out.println("Sorted Array");
//            for (int i = 0 ;i <arr.length;i++){
//                System.out.println(arr[i]);
//            }

        median(arr);
        mode(arr);
    }


    public static void mode(int[] arr){
        int max_value = arr[0];
        int max_freq = 0;
        int count = 1;
        int prev = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (prev == arr[i]){
                count++;
            }else {
                if (max_freq < count){
                    max_freq = count;
                    max_value = prev;
                }
                prev = arr[i];
                count = 1;
            }
        }
        if (count > max_freq){
            max_freq = count;
            max_value = arr[arr.length-1];
        }

        System.out.println(max_value);
    }

    public static void mean(int[] arr){
        float sum = 0;
        for (int i= 0;i <arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
    }


    public static void median(int[] arr){
        if (arr.length%2 != 0){
            float median = arr[(arr.length+1)/2];
            System.out.println(median);
            return;
        }
        int n = arr.length/2;
        float su = (arr[n] + arr[n-1]);
        float median = su/2;
        System.out.println(median);
    }





    public boolean isHappy(int n) {
        int newnum = 0;
        while (n>0){
            int temp = n%10;
            newnum += ((temp)*(temp));
            n /= 10;
        }
        System.out.println(newnum);
        if (newnum == 1){
            System.out.println("isHappy");
            return true;
        }else {
            return false;
        }
    }

    public String convertToTitle(int columnNumber) {
        int div = columnNumber/26;
        int rem = columnNumber%26;
        String ans = "";
        for (int i = 0;i<div;i++){
            ans += "A";
        }
        char fin;
        System.out.println(ans);
        if (rem == 0){
            fin = 'Z';
        }else {
            fin = (char) (rem+64);
        }
        ans += fin;
        System.out.println(ans);
        return ans;
    }

    public static int maxProfit(int[] prices) {
        int profit = Integer.MIN_VALUE;
        for (int i = 0 ; i < prices.length-1 ; i++){
            for (int j = i+1 ; j< prices.length ; j++){
                if (prices[j] > prices[i]) {
                    if (profit < (prices[j] - prices[i])) {
                        profit = (prices[j] - prices[i]);
                        System.out.println(i + " " + j);
                    }
                }
            }
        }

        if (profit > 0){
            return profit;
        }else {
            return 0;
        }
    }

    public static int trailingZeroes(int n) {
        int rem5 = 0;
        int rem10 = 0;
        for (int i = n ; i>0 ; i--){
            if (i%10 == 0){
                rem10++;
            }else if (i%5 == 0){
                rem5++;
            }
        }
        System.out.println(rem5+" "+rem10);
        return (rem10 + rem5);
    }

    public static int minof2(int a, int b){
        if (a<b){
            return a;
        }else {
            return b;
        }
    }


    public int maxArea(int[] height) {
        int maxa = 0;
        for (int i = 0 ; i<height.length-1;i++){
            for (int j = i+1 ;j<height.length;j++){
                maxa = Math.max(maxa, (Math.min(height[i], height[j])) * (j - i));
            }
        }
        return maxa;
    }

    public static int min0f2(int a, int b){
        if (a < b){
            return a;
        }else {
            return b;
        }
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> lsfinal = new LinkedList<Integer>();
        for (int i = num.length-1;i>=0;i--){
            lsfinal.add(0,(num[i]+k) % 10);
            k = ( num[i] + k) / 10;
        }
        System.out.println(lsfinal);
        while (k>0){
            lsfinal.add(0,k%10);
            k /= 10;
        }
        return lsfinal;
    }

    public List<Integer> addToArrayForm2(int[] A, int K) {
        List<Integer> res = new LinkedList<>();
        for (int i = A.length - 1; i >= 0; --i) {
            res.add(0, (A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }
        System.out.println(res);
        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
    }
    public static List<Integer> addToArrayForm3(int[] num, int k) {
        double actualn = 0;
        int pow = num.length-1;
        int i = 0;
        while (pow>=0){
            actualn += (num[i]*Math.pow(10,pow));
            System.out.println(actualn);
            i++;
            pow--;
        }
        System.out.println(" Final Actual Number "+actualn);
        double finaln = actualn + k;
        System.out.println(finaln);
        List<Integer> lsfinal = new Stack<Integer>();
        while (finaln > 0){
            int rem = (int) finaln % 10;
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
