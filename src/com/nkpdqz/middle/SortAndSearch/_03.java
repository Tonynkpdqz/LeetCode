package com.nkpdqz.middle.SortAndSearch;

import java.util.Arrays;

public class _03 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
