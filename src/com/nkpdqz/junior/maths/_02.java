package com.nkpdqz.junior.maths;

public class _02 {

    public static void main(String[] args) {
        _02 test = new _02();
        int i = test.countPrimes(12);
        System.out.println(i);
    }

    public int countPrimes(int n) {
        boolean isPrime[]=new boolean[n];
        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }

        for(int i=2;i*i<=n;i++){
            if(!isPrime[i])continue;
            for(int j=2;j*i<n;j++){
                isPrime[i*j]=false;
            }
        }

        int ans=0;
        for(int i=2;i<n;i++){
            if(isPrime[i])ans++;
        }
        return ans;
    }
}
