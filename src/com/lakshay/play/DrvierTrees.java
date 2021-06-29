package com.lakshay.play;

import com.lakshay.play.trees.TreeNode;
import com.lakshay.play.trees.TreeProblems;
import com.lakshay.play.trees.TreeTraversals;

public class DrvierTrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.left.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);

        TreeProblems treeProblems = new TreeProblems();
        System.out.println("=====Level Order Traversal======");
        treeProblems.levelOrderTraversal(root);
        System.out.println("");
        System.out.println("===========");

        System.out.println("=====ZigZag Traversal======");
        treeProblems.zigzagTraversal(root);
        System.out.println("");
        System.out.println("===========");

        TreeTraversals treeTraversals = new TreeTraversals();
        System.out.println("==== recursivce inorder ======");
        treeTraversals.recursiceInorder(root);
        System.out.println("");
        System.out.println("===========");

        System.out.println("==== inorder ======");
        treeTraversals.inorder(root);
        System.out.println("");
        System.out.println("===========");

        System.out.println("==== Sorted Array to BST ======");
        int[] array = new int[]{-10,-3,0,5,9};
        TreeNode node = treeProblems.sortedArrayToBST(array);
        System.out.println("Output " + node);
        System.out.println("");
        System.out.println("===========");
    }
}
