package com;

import java.util.Scanner;

public class startagain {
    public static void main(String[] args){
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
            printLevelWise(root.children.get(i));
        }
        System.out.println();
    }

}
