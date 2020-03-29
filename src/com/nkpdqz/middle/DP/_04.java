package com.nkpdqz.middle.DP;

import java.util.Arrays;

public class _04 {
    public int lengthOfLIS2(int[] nums) {
        if (nums.length==0){
            return 0;
        }
        if (nums.length==1){
            return 1;
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            int index = 1;
            for (int j = i; j < nums.length; j++) {
                if (k<nums[j]){
                    k = nums[j];
                    index++;
                }
            }
            res[i] = index;
        }
        int result = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i]>result){
                result=res[i];
            }
        }
        return result;
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n<=1) return n;
        int[] dp = new int[n];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
