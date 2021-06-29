package com.lakshay.play.trees;

public class TreeNode {
    int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
