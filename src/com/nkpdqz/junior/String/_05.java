package com.nkpdqz.junior.String;

import java.util.Arrays;

public class _05 {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()){
            return true;
        }
        String s1 = s.toLowerCase();
        char[] chars = s1.toCharArray();
        int k = 0;
        char[] newChars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if ((chars[i]>='0'&&chars[i]<='9') ||
                    (chars[i]>='a'&&chars[i]<='z') ||
                    (chars[i]>='A'&&chars[i]<='Z')){
                newChars[k] = chars[i];
                k++;
            }
        }
        for (int i = 0; i < k/2; i++) {
            if (newChars[i] == newChars[k-i-1]){
                continue;
            }
            else
                return false;
        }
        return true;
    }
}
