package com.nkpdqz.zhaoBank;

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        byte c = 2;
        a = a+c;
        a += c;
        c += a;
        int[] arrs = new int[n];
        for (int i = 0; i < n; i++) {
            arrs[i] = sc.nextInt();
        }
        Arrays.sort(arrs);
        if (n == 1){
            System.out.println(arrs[0]);
            return;
        }
        int sum = arrs[n-1];
        if (arrs[n-1]>0) {
            if (arrs[0]>0){
                int ssum = arrs[0];
                for (int i = 1; i < n-1; i++) {
                    ssum = ssum-arrs[i];
                }
                sum = sum - ssum;
            }else {
                int flag = 0;
                for (int i = 0; i < n; i++) {
                    if (arrs[i]>0) {
                        flag = i;
                        System.out.println(flag);
                        break;
                    }
                }
                int fusum = 0;
                for (int i = flag-1; i >=0; i--) {
                    fusum += arrs[i];
                }
                System.out.println(fusum);
                if (flag == n-1){
                    sum = sum-fusum;
                }else {
                    int sssum = arrs[flag];
                    for (int i = flag+1; i < n-1; i++) {
                        sssum = sssum-arrs[i];
                    }
                    System.out.println(sssum);
                    sum = sum-sssum-fusum;
                }
            }
        }
        else{
            for (int i = n-2; i >= 0; i--) {
                sum = sum - arrs[i];
            }
        }
        System.out.println(sum);

    }
}
