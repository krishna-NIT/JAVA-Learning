package com;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;


public class startagain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "Hackker";
        System.out.println(uniqueChar(str));
    }
    public static TreeNode<Integer> takeInput(Scanner sc){
        int n = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        int childcount = sc.nextInt();
        for (int i =0;i<n;i++){
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }
        return root;
    }

    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if (root.data == x){
            return true;
        }else {
            int childcount = root.children.size();
            for (int i=0;i<childcount;i++){
                if (checkIfContainsX(root.children.get(i),x)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void printLevelWise(TreeNode<Integer> root){
        if (root == null){
            return;
        }
        Queue<TreeNode<Integer>> q = new Queue<TreeNode<Integer>>() {
            @Override
            public boolean add(TreeNode<Integer> integerTreeNode) {
                return false;
            }

            @Override
            public boolean offer(TreeNode<Integer> integerTreeNode) {
                return false;
            }

            @Override
            public TreeNode<Integer> remove() {
                return null;
            }

            @Override
            public TreeNode<Integer> poll() {
                return null;
            }

            @Override
            public TreeNode<Integer> element() {
                return null;
            }

            @Override
            public TreeNode<Integer> peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<TreeNode<Integer>> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends TreeNode<Integer>> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
        TreeNode<Integer> NullNode = new TreeNode<Integer>(Integer.MAX_VALUE);


    }

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        ArrayList<Integer> arrls = new ArrayList<Integer>();
        int n = input.size();
        while (input.size() != 0){
            arrls.add(input.pop());
        }
        for (int i=0;i<n;i++){
            input.add(arrls.get(i));
        }
    }
    static int count = 0;

    public static int findNodeRec(LinkedListNode<Integer> head, int n) {
        if (head == null){
            return count;
        }
        if (head.data == n){
            return count;
        }else if (head.next!= null) {
            count++;
            return findNodeRec(head.next, n);
        }else {
            return -1;
        }
    }

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
        LinkedListNode<Integer> point = head;
        for (int k =0;k<i;k++){
            point = point.next;
        }
        System.out.println(head.data);
        return head;
    }


    public static boolean isBalanced(String expression) {
        if (expression.length() %2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        if (expression.length() == 0){
            return true;
        }
        //stack.add(expression.charAt(0));
        for (int i=0;i<expression.length();i++) {
            char pointbracket = expression.charAt(i);
            if (pointbracket == '(' || expression.charAt(i) == '[' || expression.charAt(i) == '{') {
                stack.add(pointbracket);
            } else if (stack.isEmpty()) {
                return false;
            } else if (matchpair(stack.lastElement(), pointbracket)) {
                stack.pop();
            }
            System.out.println(stack);
        }
        return true;
    }
    public static boolean matchpair(char a, char b){
        if (a == '(' && b ==')'){
            return true;
        }
        if (a == '{' && b =='}'){
            return true;
        }
        if (a == '[' && b ==']'){
            return true;
        }
        return false;
    }

    public static int maxFrequencyNumber(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> arls = new ArrayList<>();
        for (int i =0;i<arr.length;i++){
            if (hm.containsKey(arr[i])){
                int precount = hm.get(arr[i]);
                hm.replace(arr[i],precount+1);
            }else {
                hm.put(arr[i],1);
                arls.add(arr[i]);
            }
        }
        int maxno = 0;
        int maxrepeat = Integer.MIN_VALUE;
        for (int i =0;i<arls.size();i++){
            if (maxrepeat < hm.get(arls.get(i))){
                maxrepeat = hm.get(arls.get(i));
                maxno = arls.get(i);
            }
        }
        return maxno;
    }

    public static void printIntersection(int[] arr1,int[] arr2){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i =0;i<arr1.length;i++){
            if (hm.containsKey(arr1[i])){
                int precount = hm.get(arr1[i]);
                hm.replace(arr1[i],precount+1);
            }else {
                hm.put(arr1[i],1);
            }
        }

        HashMap<Integer,Integer> hm2 = new HashMap<>();
        ArrayList<Integer> arls2 = new ArrayList<>();
        for (int i =0;i<arr2.length;i++){
            if (hm2.containsKey(arr2[i])){
                int precount = hm2.get(arr2[i]);
                hm2.replace(arr2[i],precount+1);
            }else {
                hm2.put(arr2[i],1);
                arls2.add(arr2[i]);
            }
        }

        System.out.println(hm);
        System.out.println(hm2);
        for (int i =0;i<arls2.size();i++){
            if (hm.containsKey(arls2.get(i))) {
                if (hm.get(arls2.get(i)) > 0 && hm2.get(arls2.get(i)) > 0) {
                    int a =hm.get(arls2.get(i));
                    int b = hm2.get(arls2.get(i));
                    int loop = 0;
                    if (a<b){
                        loop = a;
                    }else {
                        loop = b;
                    }
                    for (int j =0;j<loop;j++){
                        System.out.println(arls2.get(i));
                    }
                    hm.replace(arls2.get(i), hm.get(arls2.get(i))-loop);
                    hm2.replace(arls2.get(i), hm2.get(arls2.get(i))-loop);
                }
            }
        }
    }

    public static String uniqueChar(String str){
        //HashMap<Character, Integer> hashmap = new HashMap<>();
        String output = "";
        output += str.charAt(0);
        for (int i = 0;i<str.length();i++){
            String temp = str.substring(i,i+1);
            if (!output.contains(temp)){
                output += temp;
            }
        }
        return output;
    }

    public static int PairSum(int[] input, int size) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int ans = 0;
        for (int i =0;i<input.length;i++){
            if (hashmap.containsKey(-input[i])){
                if (hashmap.containsKey(input[i])){
                    hashmap.replace(input[i],hashmap.get(input[i])+1);
                    ans += hashmap.get(input[i])*hashmap.get(-input[i]);
                }else {
                    hashmap.replace(input[i],1);
                    ans += hashmap.get(input[i])*hashmap.get(-input[i]);
                }
            }else {
                if (hashmap.containsKey(input[i])){
                    hashmap.replace(input[i],hashmap.get(input[i])+1);
                }else {
                    hashmap.put(input[i],1);
                }
            }
        }

        if (hashmap.containsKey(0)){
            int noofzero = hashmap.get(0);
            int terms = noofzero*(noofzero-1)/2;
            ans += terms;
        }
        return ans;
    }



}

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        public LinkedListNode(T data) {
            this.data = data;
        }
    }
