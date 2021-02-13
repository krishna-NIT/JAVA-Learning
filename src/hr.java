import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class hr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(backspaceCompare(a,b));

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
}
