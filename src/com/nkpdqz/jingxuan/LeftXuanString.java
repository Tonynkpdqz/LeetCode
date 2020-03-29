package com.nkpdqz.jingxuan;

import org.junit.Test;

public class LeftXuanString {

    public static String LeftRotateString(String str,int n) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(n);
        String replace = str.replace("A", "a");
        System.out.println(str);
        substring.replace("f","F");
        System.out.println(str);
        System.out.println(substring);
        String substring1 = str.substring(0, 3);
        sb.append(substring).append(substring1);
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = LeftRotateString("ABCDEfG", 3);
        //System.out.println(s);
    }


}
