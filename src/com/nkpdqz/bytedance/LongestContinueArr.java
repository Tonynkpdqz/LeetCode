package com.nkpdqz.bytedance;

public class LongestContinueArr {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        int length = 1;
        int now = nums[0];
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (now<nums[i])
                length++;
            else
                length = 1;
            if (length>max)
                max = length;
            now = nums[i];
        }
        return max;
    }
}
