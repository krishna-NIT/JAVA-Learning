package com;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class startagain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        System.out.println(isBalanced(exp));
//        TreeNode<Integer> root = new TreeNode<Integer>(4);
//        TreeNode<Integer> node1 = new TreeNode<Integer>(2);
//        TreeNode<Integer> node2 = new TreeNode<Integer>(3);
//        TreeNode<Integer> node3 = new TreeNode<Integer>(5);
//        TreeNode<Integer> node4 = new TreeNode<Integer>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//
//        System.out.println(root);
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
        System.out.print(root.data+" ");
        int n = root.children.size();
        if (n<=0){
            return;
        }
        for (int i =0;i<n;i++){
            System.out.print(root.children.get(i).data+" ");
            //printLevelWise(root.children.get(i));
        }
        System.out.println();
        for (int i =0;i<n;i++){
            printLevelWise(root.children.get(i));
        }
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


}

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
        public LinkedListNode(T data) {
            this.data = data;
        }
    }
