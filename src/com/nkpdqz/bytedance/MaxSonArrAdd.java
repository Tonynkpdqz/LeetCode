package com.nkpdqz.bytedance;

public class MaxSonArrAdd {
    public int maxSubArray(int [] numbers){
        int sum = Integer.MIN_VALUE;
        int nowsum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (nowsum>=0){
                nowsum += numbers[i];
            }else {
                nowsum = 0;
                nowsum += numbers[i];
            }
            if (nowsum>sum){
                sum = nowsum;
            }
        }
        return sum;
    }
}
