package com.nkpdqz.junior.Others;

import java.util.Arrays;
import java.util.List;

public class _03 {
    public static void main(String[] args) {
        int i = reverseBits(10000000);
        System.out.println(i);
    }

    public static int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        char[] nchar = new char[s.length()];
        int j = chars.length-1;
        for (char aChar : chars) {
            nchar[j] = aChar;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (char c:nchar
             ) {
            sb.append(c);
        }
        System.out.println(sb.toString());
        int i = Integer.parseInt(sb.toString().trim(), 2);
        return i;
    }
}
