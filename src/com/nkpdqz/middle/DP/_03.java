package com.nkpdqz.middle.DP;

import java.util.Arrays;

public class _03 {

    public int coinChange(int[] coins, int amount) {
        if (amount==0){
            return 0;
        }
        int[] dp = new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE-1);
        dp[0]=0;
        for (int i = 0; i <=amount ; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i>=coins[j]){
                    dp[i] = Math.min(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }
        return dp[amount] == Integer.MAX_VALUE-1?-1:dp[amount];
    }

}
