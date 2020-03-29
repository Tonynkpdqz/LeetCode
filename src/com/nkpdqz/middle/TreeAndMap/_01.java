package com.nkpdqz.middle.TreeAndMap;

import java.util.ArrayList;
import java.util.List;

public class _01 {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root!=null) {
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }
        return list;
    }
}
