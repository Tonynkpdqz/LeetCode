package com.nkpdqz.junior.tree;

public class _01 {

    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root==null){
            return 0;
        }
        int i = maxDepth(root.left)+1;
        int j = maxDepth(root.right)+1;
        return i>j?i:j;
    }
}
