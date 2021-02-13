import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class hr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1};
        System.out.println(searchInsert(arr,0));
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
