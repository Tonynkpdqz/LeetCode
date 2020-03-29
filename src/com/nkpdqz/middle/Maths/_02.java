package com.nkpdqz.middle.Maths;

public class _02 {

    public static void main(String[] args) {
        _02 test = new _02();
        int i = test.trailingZeroes2(1000);
        System.out.println(i);
    }

    public int trailingZeroes(int n) {
        int res = 0;
        for (int i = 1; n >= Math.pow(5, i); i++) {
            res = res + (int) (n / Math.pow(5, i));
        }

        return res;
    }

    int trailingZeroes2(int n) {
        int count = 0;

        while(n>0) {

            count += n;
            n=n/5;
        }
        return count;
    }

    public long getNFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*getNFactorial(n-1);
    }
}
