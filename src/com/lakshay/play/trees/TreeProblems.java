package com.lakshay.play.trees;

import java.util.*;

public class TreeProblems {
    public void levelOrderTraversal(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null) System.out.println(root.data);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        TreeNode nullNode = new TreeNode();
        nullNode.data = -1;
        queue.add(nullNode);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.data == -1)
            {
                System.out.println("");
                if(queue.size() != 0){
                    TreeNode treeNode = new TreeNode();
                    treeNode.data = -1;
                    queue.add(treeNode);
                }
                continue;
            }
            System.out.print(node.data);
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


    //The idea is to traverse all the node in the tree in level order(Here I use one Queue to store each level's nodes. The time I traverse each level is the queue's size(the number of nodes from upper level)). Each time a node is traversed, the position of the node(as it is in a full binary tree) is stored in the HashMap.
    // If the position of the parent node is 'n', then the left child is '2 * n' and the right child is '2 * n + 1'.
    //The width of each level is the last node's position in this level subtracts the first node's position in this level plus 1.

    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> qIndex = new LinkedList<>();
        q.add(root);
        qIndex.add(1); //store index, assuming root's index is 1
        int max = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            int start = 0, end = 0;
            for(int i=0; i<size; i++)
            {
                TreeNode node = q.remove();
                int index = qIndex.remove();
                if(i==0) start = index; //start and end index for each level
                if(i==size-1) end = index;
                if(node.left!=null)
                {
                    q.add(node.left);
                    qIndex.add(2*index);
                }

                if(node.right!=null)
                {
                    q.add(node.right);
                    qIndex.add(2*index+1);
                }
            }
            max = Math.max(max, end - start + 1);
        }
        return max;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        if(nums.length == 1) {
            TreeNode leafNode = new TreeNode(nums[0]);
            return leafNode;
        }
        int low = 0;
        int high = nums.length-1;
        int mid = low + high/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, low, mid));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid, high));
        return node;
    }
}
