package com.nkpdqz.junior.String;

import java.util.Arrays;

public class _06 {
    public static void main(String[] args) {
        String s = "+-1";
        int i = myAtoi(s);
        System.out.println(i);
    }

    public static int myAtoi(String str) {
        //System.out.println(str.isEmpty());
        if (str.isEmpty())
            return 0;
        char[] chars = str.toCharArray();
        char[] s = new char[str.length()];
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (chars[i]<='9' && chars[i]>='0'){
                s[k] = chars[i];
                k++;
            }
        }
        for (int i = 0; i < k; i++) {
            if (s[i]<='9' && s[i]>='0'){
                break;
            }
            if (i == k-1){
                return 0;
            }
        }
        String s1 = String.valueOf(s);
        System.out.println(s1);
        System.out.println(s1.length());
        String substring = s1.substring(0, s1.length() - 1);
        System.out.println(substring);
        System.out.println(substring.length());
        if (substring.equals("\0") || substring.isEmpty())
            return 0;
        int i = Integer.parseInt(substring);
        if (i>2147483647){
            return 2147483647;
        }
        if (i<-2147483648){
            return -2147483648;
        }
        return i;
    }

    public int nicer(String str){
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if(str.length() == 0) return 0;

        //2. Remove Spaces
        while(str.charAt(index) == ' ' && index < str.length())
            index ++;

        //3. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        //4. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }
}
