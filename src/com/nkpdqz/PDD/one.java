package com.nkpdqz.PDD;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arra = new int[n];
        int [] arrb = new int[n];
        for (int i = 0; i < n; i++) {
            arra[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrb[i] = sc.nextInt();
        }
        Arrays.sort(arra);
        Arrays.sort(arrb);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arra[i]*arrb[n-1-i];
        }
        System.out.println(sum);
    }
}
