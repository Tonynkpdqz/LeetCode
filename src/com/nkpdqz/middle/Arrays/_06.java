package com.nkpdqz.middle.Arrays;

public class _06 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,4,2};
        boolean b = increasingTriplet(nums);
        System.out.println(b);
    }
    public static boolean increasingTriplet(int[] nums) {
        if (nums.length<3)
            return false;
        int c1 = Integer.MAX_VALUE;
        int c2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<=c1){
                c1 = nums[i];
            }else if (nums[i]<=c2){
                c2 = nums[i];
            }else {
                return true;
            }
        }
        return false;
    }

}
