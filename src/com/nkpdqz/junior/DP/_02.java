package com.nkpdqz.junior.DP;

public class _02 {

    public int maxProfit(int[] prices) {
        int max = 0;
        if (prices.length == 0)
            return 0;
        int current = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (current>prices[i]){
                current = prices[i];
            }else {
                int sum = prices[i]-current;
                if (sum>max)
                    max = sum;
            }
        }
        return max;
    }
}
