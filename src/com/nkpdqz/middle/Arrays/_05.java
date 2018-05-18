package com.nkpdqz.middle.Arrays;

public class _05 {

    public String longestPalindrome(String s) {
        char[] T = preProcess(s).toCharArray();
        int n = T.length;
        int[] P = new int[n];
        int c = 0,r = 0;
        for (int i = 1; i < n-1; i++) {
            int i_mirror = 2*c-i;
            if (i<r){
                P[i] = Math.min(r-i,P[i_mirror]);
            }else {
                P[i]=0;
            }
            while (T[i+1+P[i]]==T[i-1-P[i]])
                P[i]++;
            if (i+P[i]>r){
                c = i;
                r = i+P[i];
            }
        }
        int maxlen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n-1; i++) {
            if (P[i]>maxlen){
                maxlen = P[i];
                centerIndex = i;
            }
        }
        int beginIndex = (centerIndex-1-maxlen)/2;
        return s.substring(beginIndex,beginIndex+maxlen);
    }

    public String preProcess(String s){
        int length = s.length();
        if (length == 0){
            return "^$";
        }
        String result = "^";
        for (int i = 0; i < length; i++) {
            result += "#"+s.charAt(i);
        }
        result += "#$";
        return result;
    }

}
