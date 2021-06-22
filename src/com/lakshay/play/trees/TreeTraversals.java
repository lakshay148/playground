package com.lakshay.play.trees;

import java.util.Stack;

public class TreeTraversals {
    //inorder traversal using stack
    public void inorder(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> nodeStack = new Stack<>();
        TreeNode current = root;

        while (current != null || nodeStack.size() > 0){
            while (current != null){
                nodeStack.add(current);
                current = current.left;
            }
            TreeNode node = nodeStack.pop();
            System.out.print(node.data);
            current = node.right;
        }
    }

    public void recursiceInorder(TreeNode root){
        if(root == null) return;

        if(root.left != null) recursiceInorder(root.left);
        System.out.print(root.data);
        if(root.right != null) recursiceInorder(root.right);
    }
}
