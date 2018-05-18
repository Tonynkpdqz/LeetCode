package com.nkpdqz.junior.arrray;

import java.util.Arrays;

public class _05 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7,8,9,10,0,1,2,3,4,5,6,7,8,9};
        int i = singleNumber(nums);
        //System.out.println(nums[15]);
        //int t;
        //Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        int only = 0;
        if (nums.length == 1){
            return nums[0];
        }
        int t;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i = i+2) {
            if (nums[i] != nums[i-1]){
                only = nums[i-1];
                break;
            }
            else {
                only = nums[nums.length-1];
            }
        }
        return only;
    }
}
