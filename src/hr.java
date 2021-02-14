import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class hr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public int[] runningSum(int[] nums) {
    int[] ret = new int[nums.length];
    int sum = 0;
    for (int i = 0;i<nums.length;i++){
        sum+=nums[i];
        ret[i]=sum;
    }
    return ret;
    }
    public String defangIPaddr(String address) {
    String fin="";
    for (int i = 0;i<address.length();i++){
        if (Character.isDigit(address.charAt(i))){
            fin+=address.charAt(i);
        }else {
            fin+="[";
            fin+=address.charAt(i);
            fin+="]";
        }
    }
    return fin;
    }
    public double[] medianSlidingWindow(int[] nums, int k) {
        int len = nums.length-k+1;
        double[] arr = new double[len];
        if (k%2!=0){
            ////////////////zol hai yaha pegit
            for (int b =0;b<len;b++){
                arr[b] = median(nums,b,(b+((k+1)/2)));
            }
        }else {
            for (int b =0;b<len;b++){
                int mid1 = (b+(k/2));
                int mid2 = (b+(k/2)-1);
                arr[b] = ( mid1+mid2 )/2;
            }
        }
        return arr;
    }
    public int median(int[] brr,int sindex, int eindex){
        int[] arr = brr;
        int minindex=0;
        for (int i=sindex;i<eindex-1;i++){
            int min = Integer.MAX_VALUE;
            for (int j = i;j<arr.length;j++){
                if (min>arr[j]){
                    min = arr[j];
                    minindex=j;
                }
            }
            //Swap
            arr[minindex]=arr[i];
            arr[i]=min;
        }
        int median = arr[(sindex+eindex)/2];
        return median;
    }














    public static boolean backspaceCompare(String S, String T) {
        LinkedList<Character> stack1 = new LinkedList<Character>();
        LinkedList<Character> stack2 = new LinkedList<Character>();
        for (int i = 0;i<S.length();i++){
            if (Character.isAlphabetic(S.charAt(i))){
                stack1.push(S.charAt(i));
            }else {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                }
            }
        }
        for (int i = 0;i<T.length();i++){
            if (Character.isAlphabetic(T.charAt(i))){
                stack2.push(T.charAt(i));
            }else {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                }
            }
        }



        if (stack1.size() == stack2.size()){
            if (!stack1.equals(stack2)){
                return false;
            }
            return true;
        }else {
            return false;
        }
    }
    public List<String> buildArray(int[] target, int n) {
        List<String> ls= new  LinkedList<String>();
        int checck=0;
        for (int i=1;i<=n;i++){
            int count =0;
            ls.add("Push");
            for (int j = 0;j<target.length;j++){
                if (target[j] == i){
                    count++;
                    checck++;
                    break;
                }
            }
            if (count==0){
                ls.add("Pop");
            }
            if (checck==target.length){
                break;
            }
        }
        return ls;
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int indexin2=0;
        int val=2;
        for (int i =0;i<nums1.length;i++){
            int count =0;
            for (int j=0;j<nums2.length;j++){
                if (nums1[i]==nums2[j]){
                    indexin2=j;
                    break;
                }
            }
            for (int k =(indexin2+1);k<nums2.length;k++){
                if (nums2[k]>nums1[i]){
                    val = nums2[k];
                    count++;
                    break;
                }
            }
            if (count==0){
                val = -1;
            }
        arr[i]=val;
        }
        return arr;
    }
    public static int searchInsert(int[] nums, int target) {
        int val=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if (((i+1)<(nums.length))) {
                if (target >= nums[i] && target <= nums[i + 1]) {
                    val = i + 1;
                }
            }

        }
        if (target>=nums[nums.length-1]){
            return nums.length;
        }
        return val;
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        LinkedList<Integer> factor = new LinkedList<Integer>();

        for (int i =2;i<deck.length;i++){
            if (deck.length%i==0) {
                factor.add(i);
            }
        }
        int bha=0;
        System.out.println(factor);
        for (int k = 0;k<factor.size();k++) {
            for (int i = 0; i < deck.length; i++) {
                int count = 0;
                for (int j = 0; j < deck.length; j++) {
                    if (deck[i] == deck[j]) {
                        count++;
                    }
                }
                if ((count % factor.get(k)) != 0) {
                    return false;
                }else{
                    bha++;
                }

            }
            System.out.println(bha);
            if(bha == (deck.length)){
                return true;
            }
        }
        return true;
    }
    public static boolean met(String input){
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if (c=='[' || c=='{' || c=='('){
                stack.push(c);
            }else if (c=='}'){
                if (stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }else if (c==']'){
                if (stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }else if (c==')'){
                if (stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    class Difference {
        private int[] elements;
        LinkedList<Integer> ls = new LinkedList<Integer>();
        public int maximumDifference = Integer.MIN_VALUE;
        public Difference(int[] arr){
            this.elements = arr;
        }

        LinkedList<Integer> lsls = new LinkedList<Integer>();
        // Add your code here
        public void computeDifference(){
            for (int i=0;i<elements.length-1;i++){
                for(int j = i+1;j<elements.length;j++){
                    int temp = elements[i]-elements[j];
                    if (temp>=0){
                        ls.add(temp);
                    }else {
                        ls.add(-1*temp);
                    }
                }
            }
            int temp = elements[0]-elements[elements.length-1];
            if (temp>=0){
                ls.add(temp);
            }else {
                ls.add(-1*temp);
            }
            System.out.println(ls);
        }
        //   Correct it
        public int maximumDifference(){
            maximumDifference = Integer.MIN_VALUE;
            while (!ls.isEmpty()){
                if (ls.getLast()>maximumDifference){
                    maximumDifference = ls.pop();
                }else {
                    ls.pop();
                }
            }
//
//            for (int i =0;i<ls.size();i++){
//                if (ls.get(i)>maximumDifference){
//                    maximumDifference=ls.get(i);
//                }
//            }
            System.out.println(maximumDifference);
            return maximumDifference;
        }
    } // End of Difference class

    public class Solution {

//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int[] a = new int[n];
//            for (int i = 0; i < n; i++) {
//                a[i] = sc.nextInt();
//            }
//            sc.close();
//
//          //  Difference difference = new Difference(a);
//
//          //  difference.computeDifference();
//
//          //  System.out.print(difference.maximumDifference);
//        }
    }
}
