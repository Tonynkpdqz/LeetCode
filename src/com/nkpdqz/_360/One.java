package com.nkpdqz._360;

import java.util.Arrays;
import java.util.Scanner;

public class One {

    public static void main(String[] args) {
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int single = 2*m-n;
        int [] helper = new int[(n-single)/2];
        int j = 0;
        int max = arr[0] + arr[n-single-1];
        for (int i = 0; i < helper.length; i++) {
            helper[i] = arr[j]+arr[n-1-single-j];
            j++;
            if(max<helper[i]){
                max = helper[i];
            }
        }
        System.out.println(max);
    }

}
