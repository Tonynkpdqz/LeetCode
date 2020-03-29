package com.nkpdqz.middle.TreeAndMap;

import java.util.Stack;

public class _05 {

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> s = new Stack<>();
        while(root!=null){
            s.push(root);
            root = root.left;
        }
        while(!s.isEmpty()){
            TreeNode curr = s.pop();
            k--;
            if(k == 0) return curr.val;
            if(curr.right != null){
                curr = curr.right;
                while(curr!=null){
                    s.push(curr);
                    curr = curr.left;
                }
            }
        }
        return 0;
    }

}
