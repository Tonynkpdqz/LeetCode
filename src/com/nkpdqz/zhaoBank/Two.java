package com.nkpdqz.zhaoBank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        Arrays.sort(h);
        int [] leng = new int[n-1];
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            leng[i] = h[i+1]-h[0];
            sum = sum + leng[i];
        }
        if (sum<=k)
            System.out.println(sum);
        int higher = n-2;

        int some = 0;
        int len = 1;
        while (sum>0){
            some = some + leng[higher]-leng[higher-len];
            if (k>some){

            }
            else {

            }
        }
    }
}
