package com.nkpdqz.junior.String;

public class _07 {
    public static void main(String[] args) {

    }

    public static int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] ned = needle.toCharArray();
        int j = 0;
        if (haystack.contains(needle)){
            int i = haystack.indexOf(needle);
            return i;
        } else {
            return -1;
        }
    }
}
