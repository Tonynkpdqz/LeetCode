package com.nkpdqz.middle.SortAndSearch;

import java.util.Arrays;

public class _04 {

    public int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i+1]>nums[i]&&nums[i+1]>nums[i+2]){
                return i+1;
            }
        }
        return nums[0]>nums[nums.length-1]?0:nums.length-1;
    }

}
