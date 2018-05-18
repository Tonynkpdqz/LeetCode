package com.nkpdqz.junior.DP;

public class _03 {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int i = 0;
        while (i<nums.length && nums[i]<0){
            res = Math.max(res,nums[i]);
            i++;
            if (i==nums.length){
                return res;
            }
        }
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            if (sum<=0)
                sum = 0;
            res = Math.max(sum,res);
        }
        return res;
    }
}
