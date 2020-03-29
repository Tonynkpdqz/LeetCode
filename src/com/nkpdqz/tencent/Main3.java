package com.nkpdqz.tencent;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] power = new int[n];
        for (int i = 0; i < n; i++) {
            power[i] = in.nextInt();
        }
        int[] gb = new int[n];
        for (int i = 0; i < n; i++) {
            gb[i] = in.nextInt();
        }
        int ansgb = 0;
        int powme = 0;
        for (int i = 0; i < n; i++) {
            if (powme<power[i]){
                ansgb += gb[i];
                powme += power[i];
            }
        }
        System.out.println(ansgb);
    }
}
