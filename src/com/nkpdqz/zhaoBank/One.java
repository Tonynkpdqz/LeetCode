package com.nkpdqz.zhaoBank;

import java.util.Arrays;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] legs = new int[n];
        int[] ming = new int[n];

        for (int i = 0; i < n; i++) {
            legs[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ming[i] = sc.nextInt();
        }
        if (n == 1)
            System.out.println(0);
        Arrays.sort(legs);
        int sum = 0;
        for (int i = n-1; i >=n/2 ; i--) {
            if (legs[i]!=legs[i-1]){
                sum += ming[i];
            }
        }
        System.out.println(sum);
    }
}
