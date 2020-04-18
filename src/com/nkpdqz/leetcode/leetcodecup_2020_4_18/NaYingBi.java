package com.nkpdqz.leetcode.leetcodecup_2020_4_18;

import java.util.Arrays;

public class NaYingBi {

    public int minCount(int[] coins) {
        int sum = 0;
        for (int coin : coins) {
            if (coin <= 2)
                sum += 1;
            else {
                int now = coin % 2 == 0 ? coin / 2 : coin / 2 + 1;
                sum += now;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        NaYingBi naYingBi = new NaYingBi();
        int i = naYingBi.minCount(new int[]{1, 2, 2,2});
        System.out.println(i);
    }
}
