import java.math.BigInteger;
import java.util.*;

class Vehicle{}

public class Circle extends Vehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> ls = new LinkedList<Integer>();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int a = 0;
        int b = 0;

        int starti = 0;
        int endi = arr.length-1;

        while(starti <=endi){
            if (starti == endi){
                a+= arr[starti];
                starti++;
            }

            if (starti<endi) {
                if (arr[starti] > arr[endi]) {
                    a += arr[starti];
                    starti++;
                } else {
                    a += arr[endi];
                    endi--;
                }
            }

            if (starti == endi){
                b+= arr[starti];
                starti++;
            }


            if (starti<endi){
                if (arr[starti] > arr[endi]){
                    b += arr[starti];
                    starti++;
                }else{
                    b += arr[endi];
                    endi--;
                }
            }

        }

        System.out.println(a+" "+b);
    }


// Baisc approach M1
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        for (int i = 0; i < n; i++) {
//            int le = scan.nextInt();
//            String str = scan.next();
//            int revindex = str.length()-1;
//
//            String ans = "";
//            for (int j = 0; j < str.length(); j++) {
//                int sum = str.charAt(j) - 96 + str.charAt(revindex) - 96;
//                //System.out.println(sum);
//                sum += 96;
//                while (sum > 122) {
//                    sum -= 26;
//                }
//                ans += (char) sum;
//                revindex--;
//            }
//            System.out.println(ans);
//        }
//    }



//    int a = (str.charAt(len/2)-96);
//    int sum = a+a+96;
//
//            while(sum> 122){
//        sum = sum-26;
//    }
//    char temp = (char) (sum);
//    ans+= temp;

//    long[] arr = new long[n];
//        for (int i = 0;i<n;i++){
//        arr[i] = scan.nextLong();
//    }
//        if (isDangerous(arr)){
//        System.out.println("YES");
//        for (int i = n-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//    }else{
//        System.out.println("NO");
//    }

    public static boolean isDangerous(long[] arr){
        if (arr.length<2){
            return false;
        }
        for (int i =0;i<arr.length-1;i++){
            if (!isPerfectSquare(arr[i]+arr[i+1])){
                return false;
            }
        }
        return true;
    }
    public static boolean isPerfectSquare(long n){
        for (int i= 1;i*i<=n;i++){
            if (i *i == n){
                return true;
            }
        }
        return false;
    }

//
//    int n = scan.nextInt();
//    long A = scan.nextLong();
//    long B = scan.nextLong();
//    long k = scan.nextLong();
//
//    long noofrounds = scan.nextLong();
//
//    long[] wizard = new long[n];
//        Arrays.fill(wizard,-noofrounds*B);
//        for (int i = 0;i<noofrounds;i++){
//        long notest = scan.nextInt();
//        for (int j = 0;j<notest;j++){
//            int inp = scan.nextInt();
//            wizard[inp-1] += (A+B);
//        }
//    }
//
//
//    long count = 0;
//        for (int i = 0;i<wizard.length;i++){
//        if (wizard[i] >= k){
//            count++;
//        }
//    }
//        System.out.println(count);
    //
//        int n = 100000;
//        boolean[] st = new boolean[n+1];
//
//        Arrays.fill(st,true);
//        st[0] = false;
//        st[1] = false;
//
//        for(int i = 2;i*i <= n;i++){
//            for(int j = i*2;j < n;j+=i){
//                st[j] = false;
//            }
//        }
//
//
//        for (int j = 0;j<testcase;j++){
//            int lucky = scan.nextInt();
//            int count = 0;
//            for (int i = 0;i<st.length;i++){
//                if (st[i] == true && i%10 == lucky){
//                    count++;
//                }
//            }
//            System.out.println(count);
//        }

    public static void getCounter(String str, int len){
        Stack<Character> stack = new Stack<>();
        String ans = "";
        int towhich = 0;

        towhich = (len/2)-1;

        for (int i = 0;i<=towhich;i++){

            int a = (str.charAt(i)-96);
            int b = (str.charAt(len -1-i)-96);

            int sum = a+b+96;

            while(sum> 122){
                sum = sum-26;
            }
            char temp = (char) (sum);
            stack.add(temp);
            ans += temp;
        }
        if (len%2 != 0){
            int a = (str.charAt(len/2)-96);
            int sum = a+a+96;

            while(sum> 122){
                sum = sum-26;
            }
            char temp = (char) (sum);
            ans+= temp;
        }
        for (int i = stack.size()-1 ;i >=0;i--){
            ans+= stack.pop();
        }
        System.out.println(ans);
    }


    public static long ans(long power, long target){
        long count = 0;
        while (power < target){
            power *= 3;
            count++;
        }
        return count;
    }
//public static void main(String[] args){
//    Scanner scan = new Scanner(System.in);
//    long n = scan.nextLong();
//    if (threefive(n)){
//        System.out.println("YES");
//    }else{
//        System.out.println("NO");
//    }
//}

    public static boolean threefive(long n){
        if(n%3 == 0 || n%5 == 0){
            return true;
        }
        int i = 0;
        while (i*3 <= n){
            long temp = n - (i*3);

            if (temp == 0){
                return true;
            }
            if (temp%5 == 0){
                return true;
            }
            i++;
        }
        return false;
    }

    public static long gcd(long a, long b){
        if (b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        long g = gcd(a,b);
        long lcm = a*b;
        return lcm/g;
    }


//        int n = scan.nextInt();
//        int A = scan.nextInt();
//        int B = scan.nextInt();
//        int k = scan.nextInt();
//
//        int noofrounds = scan.nextInt();
//        LinkedList<LinkedList<Integer>> correspondingwizard = new LinkedList<>();
//        for (int i = 0;i<noofrounds;i++){
//            int noofwizardcasted = scan.nextInt();
//            LinkedList<Integer> temp = new LinkedList<>();
//            for (int j =0;j<noofwizardcasted;j++){
//                int tempnum = scan.nextInt();
//                temp.add(tempnum);
//            }
//            correspondingwizard.add(temp);
//        }
//
//        int[] wizard = new int[n];
//        Arrays.fill(wizard,0);
//
//        for (int i = 0;i<noofrounds;i++){
//            for (int p = 0;p<n;p++){
//                wizard[p] -= B;
//            }
//            for (int p = 0;p<correspondingwizard.get(i).size();p++){
//                int index = correspondingwizard.get(i).get(p);
//                wizard[index-1] += (A+B);
//            }
//        }
//
//        int count = 0;
//        for (int i = 0;i<wizard.length;i++){
//            if (wizard[i] >= k){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//
//
//    int n = 100000;
//    boolean[] st = new boolean[n+1];
//
//        Arrays.fill(st,true);
//    st[0] = false;
//    st[1] = false;
//
//        for(int i = 2;i*i <= n;i++){
//        for(int j = i*2;j < n;j+=i){
//            st[j] = false;
//        }
//    }
//
//
//        for (int j = 0;j<testcase;j++){
//        int lucky = scan.nextInt();
//        int count = 0;
//        for (int i = 0;i<st.length;i++){
//            if (st[i] == true && i%10 == lucky){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }


    // 97 to 122

//    long n = scan.nextInt();
//        if (threefive(n)){
//        System.out.println("YES");
//    }else{
//        System.out.println("NO");
//    }

    public static boolean whoWins(int n){
        boolean[] st = new boolean[n];

        Arrays.fill(st,true);
        st[0] = false;
        st[1] = false;

        for(int i = 2;i*i <= n-1;i++){
            for(int j = i*2;j < n-1;j+=i){
                st[j] = false;
            }
        }

        for(int i = 2;i<st.length;i++){
            if (st[i] == true && st[n-i] == true){
                return true;
            }
        }
        return false;
    }



    public static BigInteger fact(int n){
        BigInteger f = new BigInteger("1");
        for(int i = 2;i<=n;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }



    public int removeDuplicates(int[] nums) {
        LinkedList<Integer> ls = new LinkedList<Integer>();
        for(int i = 0;i<nums.length;i++){
            if (!ls.contains(nums[i])){
                ls.add(nums[i]);
            }
        }

        for (int i = 0;i<ls.size();i++){
            nums[i] = ls.get(i);
        }

        return ls.size();
    }
    public static void printSubset(int[] input, int starti ,int[] output){
        //base cas
        if(starti == input.length){
            for(int i = 0;i<output.length;i++){
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }

        // m1 m2
        int[] newOutput = new int[output.length+1];
        for(int i = 0;i<output.length;i++){
            newOutput[i] = output[i];
        }
        newOutput[output.length] = input[starti];
        // option 1
        printSubset(input,starti+1,newOutput);

        printSubset(input,starti+1,output);
        // option 2

    }

    public static boolean isPalindrome(LinkedListNode<Integer> head) {
        //Your code goes here
        LinkedListNode slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (slow != null) {
            //int nk = slow.data;
            //stack.push(nk);
            slow = slow.next;
        }

        while (head != null) {

            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }

    public static void printSubsets(int input[]) {
        // Write your code here
        ps(input, 0, input.length-1);
    }
    public static void ps(int[] arr,int start,int end){

        if(end==start  && start < arr.length){
            System.out.print(arr[start]+" ");
        }
        System.out.print(arr[start]+" ");
        ps(arr, start+1,end);
        System.out.println();
        ps(arr, start+1,end);

    }

    public static int binarySearch(int input[], int element) {
        // Write your code here
        return bs(input, 0,input.length-1,element);
    }
    public static int bs(int[] arr, int start, int end, int element){
        int mid = (start+end)/2;
        if(start>end){
            return -1;
        }

        if(arr[mid] < element){
            return bs(arr,mid+1,end,element);
        }else if(arr[mid] > element){
            return bs(arr,start,mid-1,element);
        }else if(arr[mid] == element){
            return mid;
        }
        return -1;
    }

    // 12 42 36 96 10
    public static void InsertionSort(int[] arr){
        if (arr.length<=1){
            return;
        }

        for (int i = 1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (arr[j] > arr[i] && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;

        }
    }

    public static void InsertionSort1(int[] arr){
        if (arr.length <=1){
            return;
        }
        for (int i = 1 ;i <arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (arr[j] > arr[i] && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void SelectionSort(int[] arr){
        if (arr.length <=1){
            return;
        }
        for (int i = 0;i<arr.length-1;i++){
            int min = arr[i+1];
            int mini = i+1;
            for (int j = i+1;j<arr.length;j++){
                if (arr[j] < min){
                    min = arr[j];
                    mini = j;
                }

            }
            arr[mini] = arr[i];
            arr[i] = min;
        }

        if (arr[arr.length-1] < arr[arr.length-2]){
            int temp = arr[arr.length-1];
            arr[arr.length-1] = arr[arr.length-2];
            arr[arr.length-2] = temp;

        }

    }
    public static void countOrdinary(int n){
        int count = 0;
        for (int digit = 1;digit<=9;digit++){
            for (int len = 1;len<=9;len++){
                long val = 0;
                for (int i = 0;i<len;i++){
                    val = val*10 + digit;
                    if (val<=n){
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
    }


    public static boolean che(int a, int b, int c){
        if ( (a+b+c) >=2){
            return true;
        }else {
            return false;
        }
    }


    public double powe(double x, int n) {
        if (n == 1){
            return x;
        }else if (n == 0){
            return 1.0;
        }else if (n < 0) {
            return (1/x)*powe(1/x,-(n+1));
        }

        double val = powe(x*x,n/2);

        if (n%2 == 0){
            return val;
        }else {
            return val*x;
        }
    }


    public static double myPow(double x, int n) {
        if ( n < 0){
            n = Math.abs(n);
            return myPow2(1/x,n);
        }else{
            return myPow2(x,n);
        }
    }
    public static double myPow2(double x, int n) {
        if(x ==0){
            return 0;
        }

        if (n == 0){
            return 1;
        }

        if(x ==1){
            return 1;
        }


        double val = myPow(x,n/2);

        if(n%2 == 0){
            return val*val;
        }else{
            return x*val*val;
        }
    }

//    public static int handshake(int n) {
//        if (n <= 1) {
//            return 0;
//        }
//
//        int den = 2 * fact(n - 2);
//        return (fact(n)/den);
//    }

//    public static int fact(int f) {
//        if (f <= 1) {
//            return 1;
//        }
//
//        return (f*fact(f - 1));
//    }


    public List<String> fizzBuzz(int i) {
        List<String> ls = new LinkedList<String>();
        for (int j = 1; j <= i; j++) {
            String str = "";

            if (i % 5 == 0 && i % 3 == 0) {
                str = "FizzBuzz";
            } else {
                if (i % 3 == 0) {
                    str = "Fizz";
                } else if (i % 5 == 0) {
                    str = "Buzz";
                } else {
                    str = Integer.toString(j);
                }
                ls.add(str);
            }
        }

        return ls;
    }

    public static boolean checkAB(String input) {
        // Write your code here
        return check(input, 0);
    }

    public static boolean check(String inp, int i) {
        if (i >= inp.length()) {
            return true;
        }

        if (i == inp.length() - 1) {
            if (inp.charAt(i) == 'a' || inp.substring(i - 1, i + 1).equals("bb")) {
                return true;
            } else {
                return false;
            }
        }

        if (i >= 0) {
            if (inp.charAt(i) == 'a') {
                if (inp.charAt(i + 1) == 'a') {
                    return true;
                } else if (i == inp.length() - 1) {
                    return true;
                } else if (i + 2 <= inp.length()) {
                    if (inp.substring(i, i + 2).equals("bb")) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            if (i + 2 < inp.length()) {
                if (inp.substring(i, i + 2).equals("bb")) {
                    if (inp.charAt(i + 2) == 'a' || i + 2 == inp.length()) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            return check(inp, i + 1);
        }
        return true;
    }

        public static void towerOfHanoi ( int disks, char source, char auxiliary, char destination){
            if (disks == 1) {
                //System.out.println("disk 1 came");
                System.out.println(source + " " + destination);
            } else if (disks == 0) {
                System.out.println("");
            } else {
                towerOfHanoi(disks - 1, source, destination, auxiliary);
                System.out.println(source + " " + destination);
                towerOfHanoi(disks - 1, auxiliary, source, destination);
            }
        }

        public static String addStars (String s){
            // Write your code here
            //System.out.println(ad(s,s.length()-1).length());
            return ad(s, 0);
        }

        public static String ad (String s,int i){
            String str = "";
            if (i >= s.length()) {
                return str;
            }

            str = s.substring(i, i + 1);

            if (i + 1 <= s.length() - 1) {

                if (s.charAt(i) == s.charAt(i + 1)) {
                    //str = s.substring(i,i+1);
                    str = str.concat("*");
                    //i++;
                }
            }

            return str.concat(ad(s, i + 1));
        }


        public static String replace (String inp){
            return replace2(inp, 0);
        }

        public static String replace2 (String inp,int i){
            String str = "";
            if (i > inp.length()) {
                return str;
            }

            if (i + 2 <= inp.length()) {
                if (inp.substring(i, i + 2).equals("pi")) {
                    str = "3.14";
                    System.out.println(str);
                    i = i + 1;
                } else {
                    str = inp.substring(i, i + 1);
                }
            } else {
                str = inp.substring(i, i + 1);
            }

            if (i == inp.length() - 1) {
                return str;
            }
            if ((i + 1) < inp.length()) {
                return str.concat(replace2(inp, i + 1));
            } else {
                String abv = "";
                return abv;
            }
        }

//    public static String addStars(String s) {
//        // Write your code here
//        return ad(s,s.length()-1);
//    }
//
//    public static String ad(String s, int i){
//        String str = "";
//        if (i == 0){
//            str = s.substring(0,1);
//            return str;
//        }
//
//        if(s.charAt(i-1) == s.charAt(i)){
//            str = s.substring(i-1,i);
//            str = str.concat("*");
//            str = str.concat(s.substring(i-1,i));
//           // System.out.println("extra str is"+str+" concated is"+s.substring(i-1,i));
//            i--;
//        }else{
//            str = s.substring(i,i+1);
//        }
//
//
//        return ad(s, i-1).concat(str);
//    }

        public static int convert (String input,int powr){
            if (powr == input.length()) {
                return 0;
            }


            int ascii = (int) (input.charAt(input.length() - powr - 1));
            double val = Math.pow(10, powr) * (ascii - 48);
            int temp = (int) val;
            return temp + convert(input, powr + 1);
        }


        public static String removeX (String input){
            // Write your code here
            return rem(input, input.length());
        }

        public static String rem (String input,int i){
            String str = "";

            if (i <= 0) {
                return str;
            }

            if (input.charAt(i - 1) != 'x') {
                str = input.substring(i - 1, i);
            }

            return rem(input, i - 1).concat(str);

        }

//    public static String replace(String input){
//        // Write your code here
//        return replace2(input, input.length());
//
//    }
//
//    public static String replace2(String inp, int lasti){
//        if(lasti == 0){
//            return inp.substring(0,1);
//        }else if(lasti < 0){
//            String emp = "";
//            return emp;
//        }
//
//        String ne = "";
//
//        if(inp.substring(lasti-2,lasti) == "pi"){
//            ne = "pi";
//        }
//
//        return replace2(inp, lasti-3).concat(ne);
//    }
        public static int countZerosRec ( int input){

            if (input == 0) {
                return 0;
            }

            int rem = input % 10;
            int newInput = input / 10;


            if (rem == 0) {
                return countZerosRec(newInput) + 1;
            } else {
                return countZerosRec(newInput);
            }
        }

        private static boolean isSorted ( int[] arr, int i){
            if (i == arr.length - 1) {
                return true;
            }
            if (arr[i] > arr[i + 1]) {
                return false;
            }
            return isSorted(arr, i + 1);
        }

        // Wah Kya baat Hai
        // This Technique ias too Important
        public static boolean isSortedArray ( int[] arr){
            return isSorted(arr, 0);
        }


        public static int fib ( int n){
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }

            return fib(n - 1) + fib(n - 2);
        }


//    public static String removeX(String input){
//
//        if (input.length() == 1){
//            if (input == "x"){
//                String temp = "";
//                return temp;
//            }else {
//                return input;
//            }
//        }
//
//        String newInput = input.substring(0,input.length()-1);
//        String ch = input.substring(input.length()-1,input.length());
//        if (ch != "x"){
//            System.out.println(removeX(newInput).concat(ch));
//            return removeX(newInput).concat(ch);
//        }else {
//            System.out.println(removeX(newInput));
//            return removeX(newInput);
//        }
//    }

        public static double findGeometricSum ( int k){
            if (k == 0) {
                return 1;
            }

            double temp = 1 / Math.pow(2, k);
            return findGeometricSum(k - 1) + temp;
        }


        public static int sum ( int input[]){
            if (input.length == 1) {
                return input[0];
            }

            int[] newinp = new int[input.length - 1];
            for (int i = 0; i < input.length - 1; i++) {
                newinp[i] = input[i + 1];
            }
            return (input[0] + sum(newinp));
        }


        public static boolean isSorted ( int[] input){
            // Base Case
            if (input.length <= 1) {
                return true;
            }

            if (input[0] < input[1]) {
                return false;
            }

            // Logic
            int[] newinp = new int[input.length - 1];
            for (int i = 0; i < input.length; i++) {
                newinp[i] = input[i + 1];
            }

            boolean secAnswer = isSorted(newinp);
            return secAnswer;
        }


        public static class Box {
            int width;
            int height;
            int length;

            Box() {
            }

            Box(int a, int b, int c) {
                width = a;
                height = b;
                length = c;
            }

            void volume() {
                System.out.println(length * width * height);
            }
        }

        Scanner scan = new Scanner(System.in);
//        int mean = scan.nextInt();              // Median = Mean = Mode
//        int std = scan.nextInt();               // Standard Deviation
//        int topper = scan.nextInt();            // >80 Topper
//        int boundary = scan.nextInt();          // >=60 Pass         <60 Fail
//
//        int n = scan.nextInt();
//        List<Integer> lis = new ArrayList<Integer>();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        int d = scan.nextInt();
//
//        lis.add(b);
//        lis.add(c);
//        lis.add(d);
//
//        System.out.println(lis);
//        lis.add(1,d);
//        System.out.println("Hi");
//        System.out.println(lis);
//        lis.remove(2);
//        System.out.println(lis);
//
//
//        String[] ansarr = new String[n];
//        for (int i = 0;i<n;i++){
//            if (cantravel()){
//                ansarr[i] = "Yes";
//            }else {
//                ansarr[i] = "NO";
//            }
//        }
//
//        for (int i = 0;i<n;i++) {
//            System.out.println(ansarr[i]);
//        }

//        //Bubble sort
//        for (int i= 0;i<arr.length;i++){
//            for (int j = 0;j < arr.length-1-i ; j++){
//                if (arr[j]>arr[j+1]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//
//        //Printing Sorted Array in Increasing order
//        System.out.println();
//        for (int i = 0; i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        static int i = 0;
        public static void reverseString ( char[] s){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
            if (i == (s.length / 2) - 1) {
                return;
            }
            i++;
            reverseString(s);
        }


        public int find_median ( int[] v)
        {
            // Sorting Code here
            // Bubble Sort

            for (int i = 0; i < v.length - 1; i++) {
                for (int j = 0; j < v.length - i - 1; j++) {
                    if (v[j] > v[j + 1]) {
                        int temp = v[j + 1];
                        v[j + 1] = v[j];
                        v[j] = temp;
                    }
                }
            }


            // after sorting
            if (v.length == 1) {
                return v[0];
            }
            if (v.length % 2 == 0) {
                int k = v.length / 2;
                int sum = v[k] + v[k - 1];
                return sum / 2;
            } else {
                int loc = v.length / 2;
                return v[loc];
            }
        }


        public void shift1 ( int[] nums){
            if (nums.length == 0) {
                return;
            }

            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }


        public static void interQuartile (List < Integer > values, List < Integer > freqs){
            // Print your answer to 1 decimal place within this function

            for (int i = 0; i < values.size() - 1; i++) {
                for (int j = 0; j < values.size() - i - 1; j++) {
                    if (values.get(j) > values.get(j + 1)) {
                        int temp = values.get(j + 1);
                        values.remove(j + 1);
                        values.add(j, temp);

                        temp = freqs.get(j + 1);
                        freqs.remove(j + 1);
                        freqs.add(j, temp);
                    }
                }
            }
            // System.out.println(values);
            // System.out.println(freqs);

            LinkedList<Integer> lsfin = new LinkedList<>();
            for (int i = 0; i < values.size(); i++) {
                for (int j = 0; j < freqs.get(i); j++) {
                    lsfin.add(values.get(i));
                }
            }
            //System.out.println(lsfin);

            if (lsfin.size() % 2 == 0) {
                int num = lsfin.size() / 2;
                int z = median(lsfin, 0, num - 1);
                int w = median(lsfin, num, lsfin.size() - 1);
                float s = w - z;
                System.out.println(s);

            } else {
                int num = lsfin.size() / 2;
                int z = median(lsfin, 0, num - 1);
                int w = median(lsfin, num + 1, lsfin.size() - 1);
                float s = w - z;
                System.out.println(s);

            }

        }

        public static int median (List < Integer > arr,int start, int end){
            int size = end - start + 1;
            if (size % 2 != 0) {
                int median = arr.get(start + (size / 2));
                //System.out.println(median);
                return median;
            }
            int n = start + size / 2;
            int su = (arr.get(n) + arr.get(n - 1));
            int median = su / 2;
            //System.out.println(median);
            return median;
        }
        public static boolean cantravel () {
            Scanner scan = new Scanner(System.in);
            int[] arr = new int[3];
            int total_sum = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
                total_sum += arr[i];
            }
            int D = scan.nextInt();
            int E = scan.nextInt();

            LinkedList<Integer> ls = new LinkedList<>();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < E) {
                    ls.add(arr[i]);
                }
            }
            if (ls.isEmpty()) {
                return false;
            }

            int maxofLinkedlist = ls.get(0);
            if (ls.size() >= 2) {
                for (int i = 0; i < ls.size(); i++) {
                    if (maxofLinkedlist < ls.get(i)) {
                        maxofLinkedlist = ls.get(i);
                    }
                }
            }

            int rem_sum = total_sum - maxofLinkedlist;
            if (rem_sum <= D) {
                return true;
            } else {
                return false;
            }
        }


        public void rotate ( int[] nums, int k){
            int[] finalarr = new int[nums.length];
            int d = 0;
            int temp = k % nums.length;
            for (int i = nums.length - k; i < nums.length; i++) {
                finalarr[d] = nums[i];
                d++;
            }

            for (int i = 0; i <= (nums.length - k - 1); i++) {
                finalarr[d] = nums[i];
                d++;
            }

            for (int i = 0; i < nums.length; i++) {
                nums[i] = finalarr[i];
            }
        }

        public int searchInsert ( int[] nums, int target){
            int left = 0;
            int right = nums.length - 1;

            while (left < right) {
                int mid = left + ((right - left) / 2);
                if (target < nums[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }


        public int search ( int[] nums, int target){
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public int firstBadVersion ( int n){
            int left = 0;
            int right = n;
            while (left < right) {
                int mid = left + ((right - left) / 2);
                if (!isBadVersions(mid)) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }

        public static boolean isBadVersions ( int temp){
            return true;
        }
        public static int makeAnagram (String a, String b){
            int count = 0;

            return count;
        }


        public static void weightedMean (List < Integer > X, List < Integer > W){
            int len = 0;
            if (X.size() > W.size()) {
                len = X.size();
            } else {
                len = W.size();
            }

            // Write your code here
            float multisum = 0;
            int[] arr = new int[len];
            for (int i = 0; i < arr.length; i++) {
                multisum += (X.get(i) * W.get(i));
            }

            int sumW = 0;
            for (int i = 0; i < W.size(); i++) {
                sumW += W.get(i);
            }

            System.out.println(multisum);
            System.out.println(sumW);
            double ans = multisum / sumW;

            ans = Math.round(ans * 10) / 10.0;
            System.out.println(ans);
//        DecimalFormat df = new DecimalFormat("#.#");
//        System.out.println(df.format(ans));
        }

        public static List<Integer> quartiles (List < Integer > arr) {
            // Write your code here
            int n = arr.size();
            // Sorting Done here in List
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr.get(j) > arr.get(j + 1)) {
                        // swap arr[j+1] and arr[j]
                        int temp = arr.get(j);
                        arr.remove(j);
                        arr.add(j + 1, temp);
                    }
                }
            }
            System.out.println("Sorted List : " + arr);
            List<Integer> lsfin = new LinkedList<Integer>();
            int mid_inddex = 0;
            if (arr.size() % 2 == 0) {
                mid_inddex = arr.size() / 2;
                lsfin.add(median(arr, 0, mid_inddex - 1));
                lsfin.add(median(arr, 0, arr.size() - 1));
                lsfin.add(endmedian(arr, mid_inddex, arr.size() - 1));
                System.out.println(lsfin);
                return lsfin;
            } else {
                mid_inddex = arr.size() / 2;
                lsfin.add(median(arr, 0, mid_inddex - 1));
                lsfin.add(median(arr, 0, arr.size() - 1));
                lsfin.add(endmedian(arr, mid_inddex + 1, arr.size() - 1));
                System.out.println(lsfin);
                return lsfin;
            }
        }

        public static int endmedian (List < Integer > arr,int start, int end){
            int median = 0;
            int len = end - start + 1;

            if (len % 2 == 0) {
                int st = start + len / 2;
                median = arr.get(st) + arr.get(st - 1);
                return median / 2;
            } else {
                int temp = len / 2;
                median = arr.get(temp + start);
                return median;
            }
        }


        public static void stdDev (List < Integer > arr) {
            // Print your answers to 1 decimal place within this function
            float sum = 0;
            for (int i = 0; i < arr.size(); i++) {
                sum += arr.get(i);
            }
            float mean = sum / arr.size();
            sum = 0;
            float[] diffsquare = new float[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                float temp = mean - arr.get(i);
                diffsquare[i] = (temp * temp);
                sum += diffsquare[i];
            }
            float val = sum / arr.size();
            double ans = Math.sqrt(val);
            System.out.println(ans);
        }


        public static void mode ( int[] arr){
            int max_value = arr[0];
            int max_freq = 0;
            int count = 1;
            int prev = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (prev == arr[i]) {
                    count++;
                } else {
                    if (max_freq < count) {
                        max_freq = count;
                        max_value = prev;
                    }
                    prev = arr[i];
                    count = 1;
                }
            }
            if (count > max_freq) {
                max_freq = count;
                max_value = arr[arr.length - 1];
            }

            System.out.println(max_value);
        }

        public static void mean ( int[] arr){
            float sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println(sum / arr.length);
        }


        public boolean isHappy ( int n){
            int newnum = 0;
            while (n > 0) {
                int temp = n % 10;
                newnum += ((temp) * (temp));
                n /= 10;
            }
            System.out.println(newnum);
            if (newnum == 1) {
                System.out.println("isHappy");
                return true;
            } else {
                return false;
            }
        }

        public String convertToTitle ( int columnNumber){
            int div = columnNumber / 26;
            int rem = columnNumber % 26;
            String ans = "";
            for (int i = 0; i < div; i++) {
                ans += "A";
            }
            char fin;
            System.out.println(ans);
            if (rem == 0) {
                fin = 'Z';
            } else {
                fin = (char) (rem + 64);
            }
            ans += fin;
            System.out.println(ans);
            return ans;
        }

        public static int maxProfit ( int[] prices){
            int profit = Integer.MIN_VALUE;
            for (int i = 0; i < prices.length - 1; i++) {
                for (int j = i + 1; j < prices.length; j++) {
                    if (prices[j] > prices[i]) {
                        if (profit < (prices[j] - prices[i])) {
                            profit = (prices[j] - prices[i]);
                            System.out.println(i + " " + j);
                        }
                    }
                }
            }

            if (profit > 0) {
                return profit;
            } else {
                return 0;
            }
        }

        public static int trailingZeroes ( int n){
            int rem5 = 0;
            int rem10 = 0;
            for (int i = n; i > 0; i--) {
                if (i % 10 == 0) {
                    rem10++;
                } else if (i % 5 == 0) {
                    rem5++;
                }
            }
            System.out.println(rem5 + " " + rem10);
            return (rem10 + rem5);
        }

        public static int minof2 ( int a, int b){
            if (a < b) {
                return a;
            } else {
                return b;
            }
        }


        public int maxArea ( int[] height){
            int maxa = 0;
            for (int i = 0; i < height.length - 1; i++) {
                for (int j = i + 1; j < height.length; j++) {
                    maxa = Math.max(maxa, (Math.min(height[i], height[j])) * (j - i));
                }
            }
            return maxa;
        }

        public static int min0f2 ( int a, int b){
            if (a < b) {
                return a;
            } else {
                return b;
            }
        }
        public static List<Integer> addToArrayForm ( int[] num, int k){
            List<Integer> lsfinal = new LinkedList<Integer>();
            for (int i = num.length - 1; i >= 0; i--) {
                lsfinal.add(0, (num[i] + k) % 10);
                k = (num[i] + k) / 10;
            }
            System.out.println(lsfinal);
            while (k > 0) {
                lsfinal.add(0, k % 10);
                k /= 10;
            }
            return lsfinal;
        }

        public List<Integer> addToArrayForm2 ( int[] A, int K){
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
        public static List<Integer> addToArrayForm3 ( int[] num, int k){
            double actualn = 0;
            int pow = num.length - 1;
            int i = 0;
            while (pow >= 0) {
                actualn += (num[i] * Math.pow(10, pow));
                System.out.println(actualn);
                i++;
                pow--;
            }
            System.out.println(" Final Actual Number " + actualn);
            double finaln = actualn + k;
            System.out.println(finaln);
            List<Integer> lsfinal = new Stack<Integer>();
            while (finaln > 0) {
                int rem = (int) finaln % 10;
                finaln /= 10;
                lsfinal.add(rem);
            }
            System.out.println(lsfinal);
            List<Integer> lsf = new LinkedList<Integer>();
            int j = lsfinal.size() - 1;
            while (j >= 0) {
                lsf.add(lsfinal.remove(j));
                j--;
            }
            System.out.println(lsf);
            return lsf;
        }

        public static boolean isPalindrome ( int x){
            if (x < 0) {
                return false;
            }
            LinkedList<Integer> ls = new LinkedList<Integer>();
            while (x > 0) {
                int temp = x % 10;
                x /= 10;
                ls.add(temp);
            }
            System.out.println(ls);
            int lasti = ls.size() - 1;
            int starti = 0;
            while (lasti > starti) {
                if (ls.get(lasti) != ls.get(starti)) {
                    return false;
                }
                lasti--;
                starti++;
            }
            return true;
        }

//public Circle(double radius){
//    if (radius<0){
//        radius =0;
//        this.radius = radius;
//    }else {
//        this.radius = radius;
//    }
//}
        static int radius = 0;
        public double getRadius () {
            return this.radius;
        }
        public double getArea () {
            return (getRadius() * getRadius() * Math.PI);
        }

}


