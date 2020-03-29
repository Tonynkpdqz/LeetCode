package com.nkpdqz.middle.SortAndSearch;

import java.util.Arrays;

public class _07 {
    public int search(int[] nums, int target) {
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]){
                return i;
            }
        }
        return res;
    }
}
