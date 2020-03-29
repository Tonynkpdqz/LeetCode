package com.nkpdqz.nowcoder;

public class ReverseNumber {

    public static void main(String[] args) {
        int i = reverseNumber(8, 2);
        System.out.println(i);
    }

    public static int reverseNumber(int n,int m){
        return (n/2)*m;
    }
}
