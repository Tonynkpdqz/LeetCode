package com.nkpdqz.middle.SortAndSearch;

public class _05 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1,-1};
        if (nums.length==1){
            if (nums[0]==target){
                return new int[]{0,0};
            }else {
                return res;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target&&res[0]==-1){
                res[0] = i;
                continue;
            }
            if (nums[nums.length-1]==target&&res[0]!=-1){
                res[1] = nums.length-1;
                break;
            }
            if (nums[i]!=target&&res[0]!=-1){
                res[1] = i-1;
                break;
            }

        }
        return res;
    }
}
