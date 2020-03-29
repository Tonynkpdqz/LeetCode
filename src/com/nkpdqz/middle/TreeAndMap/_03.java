package com.nkpdqz.middle.TreeAndMap;

public class _03 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length!=inorder.length)
            return null;
        return myBuildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    private TreeNode myBuildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (inStart>inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int position = findPosition(inorder,inStart,inEnd,preorder[preStart]);
        root.left = myBuildTree(preorder,preStart+1,preStart+(position-inStart),inorder, inStart,position-1);
        root.right = myBuildTree(preorder,preStart+(position-inStart)+1,preEnd,inorder,position+1,inEnd);
        return root;
    }

    private int findPosition(int[] inorder, int inStart, int inEnd, int key) {
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i]==key){
                return i;
            }
        }
        return -1;
    }
}
