package com.nkpdqz.jingxuan;


import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class PrintFromTopToBottom {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode tnode = null;
        while(!q.isEmpty()){
            for(TreeNode node:q){
                list.add(node.val);
            }
            //System.out.println(q.size());
            int size = q.size();
            for(int i = 0;i<size;i++){
                tnode = q.remove();
                if(tnode.left != null){
                    q.offer(tnode.left);
                }
                if(tnode.right != null){
                    q.offer(tnode.right);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        PrintFromTopToBottom test = new PrintFromTopToBottom();
        TreeNode te0 = new TreeNode(10);
        TreeNode te1 = new TreeNode(6);
        TreeNode te2 = new TreeNode(14);
        TreeNode te3 = new TreeNode(4);
        TreeNode te4 = new TreeNode(8);
        TreeNode te5 = new TreeNode(2);
        TreeNode te6 = new TreeNode(16);
        te0.left = te1;
        te0.right = te2;
        te1.left = te3;
        te1.right = te4;
        te2.left = te5;
        te2.right = te6;
        ArrayList<Integer> list = test.PrintFromTopToBottom(te0);
        for (Integer i:list
             ) {
            //System.out.println(i);
        }
    }
}
