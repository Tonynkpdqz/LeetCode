package com.nkpdqz.tencent;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    /*

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int [] money = new int[n];
        for (int i = 0; i < n; i++) {
            money[i] = in.nextInt();
        }
        int min = 0;
        for (int i = 1; i <= m; i++) {
            int thismin = minNum(i,money);
            if (thismin>min)
                min = thismin;
        }
        System.out.println(min+1);
    }

    public static int minNum(int m,int[] money){
        Arrays.sort(money);
        for (int i:money
             ) {
            if (m == i)
                return 1;
        }
        int sum = 0;
        for (int i = money.length-1; i >=0&&m>0; i--) {
            while (m>=money[i] && m>=0){
                m = m-money[i];
                sum++;
            }
        }
        if (m == 0)
            return sum;
        else return -1;
    }

}
