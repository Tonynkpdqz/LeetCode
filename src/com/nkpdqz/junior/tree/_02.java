package com.nkpdqz.junior.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class _02 {
    @Test
    public boolean isValidBST(TreeNode root) {
        if (root == null){
            return true;
        }
        if (root.left!=null) {
            if (root.left.val>=root.val){
                return false;
            }
            boolean b = isValidBST(root.left);
            if (!b) {
                return false;
            }
        }
        if (root.right!= null) {
            if (root.right.val<=root.val){
                return false;
            }
            boolean f = isValidBST(root.right);
            if (!f) {
                return false;
            }
        }
        return true;
    }

    @Test
    public boolean nicer(TreeNode root){
        List<Integer> list = new ArrayList<>();
        orderTraversal(root,list);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)<=list.get(i+1)){
                continue;
            }else {
                return false;
            }
        }
        return true;
    }

    void orderTraversal(TreeNode treeNode,List list){
        if (treeNode != null) {
            orderTraversal(treeNode.left,list);
            list.add(treeNode.val);
            orderTraversal(treeNode.right,list);
        }
    }


}
