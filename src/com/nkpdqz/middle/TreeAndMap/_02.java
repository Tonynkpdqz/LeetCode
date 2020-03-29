package com.nkpdqz.middle.TreeAndMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _02 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root==null)
            return result;
        LinkedList<TreeNode> nodelist = new LinkedList<>();
        boolean order = true;
        nodelist.offer(root);
        while (!nodelist.isEmpty()){
            int size = nodelist.size();
            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = nodelist.poll();
                if (order)
                    ll.add(node.val);
                else
                    ll.add(0,node.val);
                if (node.left!=null)
                    nodelist.offer(node.left);
                if (node.right!=null)
                    nodelist.offer(node.right);
            }
            order = !order;
            result.add(ll);
        }
        return result;
    }
}
