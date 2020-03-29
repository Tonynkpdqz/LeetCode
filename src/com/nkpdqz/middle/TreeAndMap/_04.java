package com.nkpdqz.middle.TreeAndMap;

import java.util.LinkedList;
import java.util.Queue;

public class _04 {

    public void connect(TreeLinkNode root) {
        if (root==null)
            return;
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeLinkNode node = queue.poll();
                if (node.left!=null)
                    queue.offer(node.left);
                if (node.right!=null)
                    queue.offer(node.right);
                if (i<n-1)
                    node.next = queue.peek();
            }
        }
    }

}
