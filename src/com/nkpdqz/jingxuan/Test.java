package com.nkpdqz.jingxuan;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) {

        //StringBuffer sb = new StringBuffer();

        TreeNode t = new TreeNode(1);
        List<TreeNode> list = new ArrayList<>();
        list.add(t);
        for (int i = 0; i < 10; i++) {
            t = new TreeNode(i+2);
            list.add(t);
        }
        System.out.println(list.size());
        for (TreeNode ts:list
             ) {
            System.out.println(ts.val);
        }

        /*String s1 = "3700";
        String s2 = "3215";
        System.out.println(s1.compareTo(s2));
        String s = String.valueOf(new char[]{'1', '2'});
        System.out.println(s);
        Test test = new Test();
        test.sout();
        int a = 10;
        char b = (char) a;
        String s3 = String.valueOf(a);
        System.out.println(s3);
        s3.getClass().getSimpleName();*/
        //String s = new String("123");
        //int a = 7/3;
        //System.out.println(s=="123");
        //System.out.println(a);
        /*String s = "123456";
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        queue.offer("a");
        queue.offer("c");
        queue.offer("m");
        queue.offer("l");
        queue.offer("b");
        String poll = queue.poll();
        System.out.println(poll);*/
        //System.out.println(1.0E9);
    }

    public void sout(){
        System.out.println(getClass().getClassLoader().toString());
    }
}
