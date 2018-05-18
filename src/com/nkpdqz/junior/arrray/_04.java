package com.nkpdqz.junior.arrray;

import java.util.Arrays;

public class _04 {

    public static void main(String[] args) {
        int[] a = {1,2,2,3,1,5};
        boolean b = containsDuplicate(a);
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
}
