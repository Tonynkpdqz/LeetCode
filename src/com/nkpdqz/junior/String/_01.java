package com.nkpdqz.junior.String;

public class _01 {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = reverseString(s);
        System.out.println(s1);
    }
    public static String reverseString(String s) {
        if (s.length() == 0){
            return s;
        }
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length-1; i >=0 ; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
