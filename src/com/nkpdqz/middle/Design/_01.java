package com.nkpdqz.middle.Design;

import java.util.LinkedList;
import java.util.Queue;

public class _01 {

    public static Queue<TreeNode> queue = new LinkedList<>();//用于保存将树结构序列化成字符串时使用来保存
    public static Queue<TreeNode> dataqueue = new LinkedList<>();//用于将字符串结构反序列化成树时使用来保存节点
    public String string = "";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {//如果根节点为空，整棵树为空，返回“#”
            return "#";
        } else {
            queue.add(root);
            while (!queue.isEmpty()) {//直到队列为空，才跳出循环
                TreeNode treeNode = queue.poll();//每次取出队列的第一的节点
                if (treeNode == null)//如果为空，那么直接输出“#”，不再把该点的左右子节点加入队列
                    string = string + "null" + ",";
                else {//该节点不为空，则把该点的值加上在字符串后面
                    string = string + treeNode.val + ",";
                    queue.add(treeNode.left);//该节点不为空，那么它的左右子节点都要加进去，可能为空，可能不为空，加进去不判断
                    queue.add(treeNode.right);//从队列中取出来才判断是不是为空，为空则没有下一层了
                }
            }
        }
        string = string.substring(0, string.length() - 2);//将后面的“，”去掉
        return string;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strs = data.split(",");//根据“，”来分隔成为字符串数组
        if (strs.length == 0||data.equals("#")) {//判断字符串数组是等于#或者为空
            TreeNode rooTreeNode = null;
            return rooTreeNode;//直接返回空根节点
        } else {//数组中至少有一个元素
            TreeNode rootNode = new TreeNode(Integer.parseInt(strs[0]));//拿到数组的第一个元素
            dataqueue.add(rootNode);//把根节点加进去队列中（思路是把已经创建好的节点加进去队列中）
            int i = 1;
            while (!dataqueue.isEmpty() && i < strs.length) {//直到队列为空，或者数组中元素被取完了
                TreeNode treeNode = dataqueue.poll();//每次弹出队列的第一个节点，分别构造左右节点
                if (strs[i].equals("null")) {//如果等于“#”,那么取出来的这个节点的左节点为空
                    treeNode.left = null;
                    i++;
                } else {//如果不是空节点，那么我们要把这个节点加入队列中，这意味着这个节点可能还有子节点
                    treeNode.left = new TreeNode(Integer.parseInt(strs[i]));
                    dataqueue.add(treeNode.left);
                    i++;
                }//下面接着判断右节点，注意，有可能数组被取光了，也就是没有右节点了
                if (i < strs.length&&strs[i].equals("#") ) {
                    treeNode.right = null;
                    i++;
                } else if(i < strs.length&& !strs[i].equals("#")){
                    treeNode.right = new TreeNode(Integer.parseInt(strs[i]));
                    dataqueue.add(treeNode.right);
                    i++;
                }

            }
            return rootNode;
        }

}
}
