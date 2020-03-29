package com.nkpdqz.webank;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int minTime = 0;
        int ar = 36;
        minTime += nums[5];
        while (nums[4]>0){
            nums[4]--;
            ar = ar-25;
            minTime++;
            if (nums[0]>0 && ar>0){
                nums[0]--;
                ar--;
            }
            ar = 36;
        }
        while (nums[3]>0){
            nums[3]--;
            minTime++;
            ar = ar-16;
            if (nums[2]>=5){
                nums[2] = nums[2]-5;
            }else {
                while (nums[1]>0 && ar>0){
                    nums[1]--;
                    ar = ar-4;
                }
                while (ar>0 && nums[0]>0){
                    nums[0]--;
                    ar--;
                }
            }
            ar = 36;
        }
        while (nums[2]>4){
            nums[2] = nums[2]-4;
            minTime++;
        }
        if(nums[2]>0){
            ar = ar - nums[2]*9;
            minTime++;
            if (nums[1]>=nums[2]){
                ar = ar - nums[2]*4;
                nums[1] = nums[1]-nums[2];
                while (nums[0]>0 && ar>0){
                    nums[0]--;
                    ar--;
                }
            }else {
                ar = ar - nums[1] * 4;
                nums[1] = 0;
                while (nums[0]>0 && ar>0){
                    nums[0]--;
                    ar--;
                }
            }
        }
        ar = 36;
        while (nums[1]>9){
            minTime++;
            nums[1] = nums[1]-9;
        }
        if (nums[1]>0){
            ar = ar - nums[1]*4;
            minTime++;
            while (ar>0 && nums[0]>0){
                nums[0]--;
                ar--;
            }
        }
        ar = 36;
        while (nums[0]>36){
            minTime++;
            nums[0] = nums[0]-36;
        }
        if (nums[0]>0)
            minTime++;
        System.out.println(minTime);
    }
}
