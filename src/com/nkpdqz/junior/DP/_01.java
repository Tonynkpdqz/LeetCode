package com.nkpdqz.junior.DP;

public class _01 {

    public int climbStairs(int n) {
        int a = 1, b = 1, re = 0;
        if(n == 1 || n ==0){
            return 1;
        }
        while(--n > 0){
            re = a+b;
            b = a;
            a = re ;
        }
        return re;
    }

    public int climbStairsMe(int n) {
        if (n==0||n==1){
            return 1;
        }else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}
