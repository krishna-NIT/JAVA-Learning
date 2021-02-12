import java.util.Scanner;
import java.util.Stack;

public class hr {
    public static void main(String []argh)
    {int a =Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(met(input));
        }

    }
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length%2!=0){
            return false;
        }

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
