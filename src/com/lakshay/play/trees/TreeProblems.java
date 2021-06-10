package com.lakshay.play.trees;

import java.util.*;

public class TreeProblems {
    public void levelOrderTraversal(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) System.out.println(root.data);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }

    public void zigzagTraversal(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) System.out.println(root.data);
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.add(root);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                TreeNode treeNode = stack1.pop();
                System.out.print(treeNode.data);
                if(treeNode.left!= null) stack2.add(treeNode.left);
                if(treeNode.right != null) stack2.add(treeNode.right);
            }
            while (!stack2.isEmpty()){
                TreeNode treeNode = stack2.pop();
                System.out.print(treeNode.data);
                if(treeNode.right != null) stack1.add(treeNode.right);
                if(treeNode.left!= null) stack1.add(treeNode.left);
            }
        }
    }
}
