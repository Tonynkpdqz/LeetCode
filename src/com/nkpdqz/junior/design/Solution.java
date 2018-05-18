package com.nkpdqz.junior.design;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Solution {

    private int[] nums;
    private int[] result;
    public Solution(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len = nums.length;
        result = new int[len];
        System.arraycopy(nums, 0, result, 0, len);
        int pos;
        int temp;
        Random random = new Random();
        for (int i = len-1; i >=0 ; i--) {
            pos = random.nextInt(i+1);
            temp = result[pos];
            result[pos] = result[i];
            result[i] = temp;
        }
        return result;
    }
}
