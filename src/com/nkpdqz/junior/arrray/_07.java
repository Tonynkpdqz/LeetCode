package com.nkpdqz.junior.arrray;

import java.util.Arrays;
import java.util.List;

public class _07 {

    public static void main(String[] args) {
        int[] a = {9};
        int[] ints = plusOne(a);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] plusOne(int[] digits) {

        if (digits[0] == 0){
            digits[0] = 1;
            return digits;
        }

        if (digits[digits.length-1] != 9){
            digits[digits.length-1] = digits[digits.length-1] +1;
            return digits;
        }else {
            for (int i = digits.length-1; i >= 0; i--) {
                if (digits[i] == 9){
                    digits[i] = 0;
                    if (i==0){
                        int[] ans = new int[digits.length+1];
                        ans[0] = 1;
                        for (int j = 1; j < ans.length; j++) {
                            ans[j] = 0;
                        }
                        return ans;
                    }
                }else {
                    digits[i] = digits[i] + 1;
                    break;
                }
            }
            return digits;
        }

        
        /*if (digits[0] == 0){
            digits[0] = 1;
            return digits;
        }
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = (int) (digits[i] * (Math.pow(10,digits.length-i-1)) + sum);
        }
        sum = sum+1;
        
        int key = (int) Math.pow(10,digits.length);
        if (sum>=key){
            int[] ans = new int[digits.length+1];
            for (int i = 0; i < ans.length; i++) {

                ans[ans.length-i-1] = sum%10;
                sum = sum/10;
            }
            return ans;
        } else {
            digits[digits.length-1] = digits[digits.length-1] +1;
            return digits;
        }*/

    }

}
