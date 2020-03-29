package com.nkpdqz;

import java.util.Scanner;

public class TestnOW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        int sum = 0;
        int start = -1;
        //System.out.println(sb);
        for (int i = 0; i < sb.length()-2; i++) {
            if(sb.charAt(i)=='1'&&sb.charAt(i+1)=='0'&&sb.charAt(i+2)=='1'){
                sum++;
                if(start==-1){
                    start = i;
                }
            }
        }
        System.out.print(sum+" "+start);
    }
}
