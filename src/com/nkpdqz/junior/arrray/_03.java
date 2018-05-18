package com.nkpdqz.junior.arrray;

import java.util.Arrays;

public class _03 {

    public static void main(String[] args) {
        int[] a = {1,2};
        rotate(a,2);
        for (int i:a
             ) {
            System.out.println(i);
        }
    }

    public static void rotate(int[] nums, int k) {

        if (nums.length<2){
            System.out.println(nums[nums.length-1]);
            return;
        }
        if (k>nums.length){
            k = k%nums.length;
        }
        if (k==nums.length){
            return;
        }
        for (int i = 0; i < nums.length/2; i++) {
            int temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }

        for (int i = 0; i < k/2; i++) {
            int temp=nums[i];
            nums[i]=nums[k-1-i];
            nums[k-1-i]=temp;
        }

        for (int i = 0; i < (nums.length-k)/2; i++) {
            int temp=nums[i+k];
            nums[i+k]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
    }
}
