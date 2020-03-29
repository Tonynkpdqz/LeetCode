package com.nkpdqz.nowcoder;

import java.util.Arrays;

public class CardGame {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{1, 2, 3, 4, 5};
        int game = game(5, a);
        System.out.println(game);
    }

    public static int game(int n,int [] a){
        int sum = 0;
        Arrays.sort(a);
        if (n%2 == 0) {
            for (int i = n - 1; i >= 0; i = i - 2) {
                sum = sum + a[i] - a[i - 1];
            }
        }else {
            for (int i = n - 1; i >= 1; i = i - 2) {
                sum = sum + a[i] - a[i - 1];
            }
            sum = sum + a[0];
        }
        return sum;
    }
}
