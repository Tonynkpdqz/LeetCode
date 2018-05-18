package com.nkpdqz.junior.Others;

public class _01 {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1'){
                res++;
            }
        }
        return res;
    }
}
