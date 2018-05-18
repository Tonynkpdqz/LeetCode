package com.nkpdqz.junior.tree;

public class _05 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        return helper(nums,0,nums.length-1);
    }

    private TreeNode helper(int[] num, int low, int high) {
        if (low>high)
            return null;
        int center = low+(high-low)/2;
        if ((high-low)%2 == 1)
            center++;
        TreeNode node = new TreeNode(num[center]);
        node.left = helper(num,low,center-1);
        node.right = helper(num,center+1,high);
        return node;
    }
}
