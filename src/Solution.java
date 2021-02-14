import java.util.LinkedList;
import java.util.Scanner;


class Difference {
    private int[] elements;
    public int maximumDifference;
    public Difference(int[] arr){
        this.elements = arr;
    }
    // Add your code here

    LinkedList<Integer> ls = new LinkedList<Integer>();
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

        System.out.println("Max started");
        maximumDifference = Integer.MIN_VALUE;
        for (int i=0;i<ls.size();i++){
            if (ls.get(i)>maximumDifference){
                maximumDifference = ls.get(i);
            }
        }
        this.maximumDifference = maximumDifference;
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}