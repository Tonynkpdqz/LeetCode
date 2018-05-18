package com.nkpdqz.junior.Others;

import java.util.Arrays;

public class _06 {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=i){
                return i;
            }
        }
        return nums[nums.length-1]+1;
    }

}

