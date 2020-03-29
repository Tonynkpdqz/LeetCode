package com.nkpdqz.middle.DP;

public class _01 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] canreach = new boolean[n];
        canreach[n-1] = true;
        for (int i = n-2; i >= 0 ; i--) {
            //第一种情况，通过这个点可以直接到达终点
            if (nums[i]>=(n-1-i)){
                canreach[i] = true;
                continue;
            }
            //第二种，通过这个点可以到达一个标志位为true的点到达终点
            for (int j =i; j < n-1; j++) {
                if (canreach[j] && (j-i) <=nums[i]){
                    canreach[i] = true;
                    continue;
                }
            }
        }
        return canreach[0];
    }
}
