package com.lakshay.play;

import com.lakshay.play.trees.TreeNode;
import com.lakshay.play.trees.TreeProblems;

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

        System.out.println("=====ZigZag Traversal======");
        treeProblems.zigzagTraversal(root);
    }
}
