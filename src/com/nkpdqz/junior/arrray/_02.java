package com.nkpdqz.junior.arrray;

import java.util.ArrayList;
import java.util.List;

public class _02 {

    public static void main(String[] args) {
        int[] prices = {1,2,3,4,2,1,4,2};
        //int maxProfit = maxProfit(prices);
        int maxProfit = Nicer(prices);
        System.out.println(maxProfit);
    }

    public int profit(int [] arr){
        int start = arr[0];
        int back = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<start){
                start = arr[i];
            }
            if(arr[i]>back){
                back = arr[i];
            }
        }
        return back-start;

    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int k = 0;
        for (int loop = 0;loop<prices.length;loop = loop + k){

            for (int i = k; i < prices.length-1; i++) {
                if (prices[i]<prices[i+1]){
                    max = max - prices[i];
                    k = i;
                    break;
                }
            }

            if (max == 0){
                for (int i = k; i < prices.length-1; i++) {
                    if (prices[k]>prices[k+1]){
                        continue;
                    } else {
                        k = i;
                        break;
                    }
                }
            }

            for (int i = k; i < prices.length-1; i++) {
                if (prices[k]<prices[k+1]){
                    continue;
                } else {
                    max = max + prices[k];
                    k = i;
                    break;
                }
            }

        }
        return max;
    }


    public static int Nicer(int[] prices){
        int size = prices.length;
        if(size <= 0) {
            return 0;
        }

        int max = 0;
        for(int i=1; i<size; i++) {
            if(prices[i] - prices[i-1] > 0) {
                max += (prices[i] - prices[i-1]);
            }
        }
        return max;
    }
}
