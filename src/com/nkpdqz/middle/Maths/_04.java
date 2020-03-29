package com.nkpdqz.middle.Maths;

public class _04 {

    public double myPow(double x, int n) {
        double res = 1;
        if (n==0){
            return res;
        }else if (n<0){
            int nn = -n;
            for (int i = 0; i < nn; i++) {
                res = res * x;
            }
            res = 1 / res;
            return res;
        }else {
            for (int i = 0; i < n; i++) {
                res = res * x;
            }
            return res;
        }
    }

    public double power(double x,int n){
        if (n==0)
            return 1;
        double ans = power(x,n/2);
        if (n%2==0)
            return ans*ans;
        else
            return ans*ans*x;
    }

    public double myPower(double x,int n){
        if (n<0)
            return 1.0/power(x,-n);
        else
            return power(x,n);
    }
}
