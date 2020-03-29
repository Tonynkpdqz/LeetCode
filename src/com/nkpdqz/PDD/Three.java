package com.nkpdqz.PDD;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,dis;
        n = sc.nextInt();
        dis = sc.nextInt();
        Map<Integer,Integer> bankMap = new HashMap<>();
        Map<Integer,Integer> disMap = new HashMap<>();
        int [] loc = new int[n];
        int [] diss = new int[n];
        for (int i = 0; i < n; i++) {
            int fir = sc.nextInt();
            int sec = sc.nextInt();
            bankMap.put(fir,sec);
            loc[i] = fir;
            diss[i] = sec;
            disMap.put(sec,fir);
        }
        int sum = 0;
        int max = 0;
        Arrays.sort(diss);
        int distence;
        for (int i = n-1; i >0; i--) {
            distence = disMap.get(diss[n-1])-disMap.get(diss[i-1]);
            int abs = Math.abs(distence);
            if (abs>dis){
                System.out.println(diss[n-1]+diss[i-1]);
                return;
            }
        }
        /*for (int i = 0; i < n-1; i++) {
            for (int k = i+1; k < n; k++) {
                if(loc[i]+dis<=loc[k]){
                    sum = bankMap.get(loc[i])+bankMap.get(loc[k]);
                    if (sum>max){
                        max = sum;
                    }
                }
                sum = 0;
            }
        }
        System.out.println(max);*/
    }
}
