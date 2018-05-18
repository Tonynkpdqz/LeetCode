package com.nkpdqz.junior.Others;

public class _02 {

    public static void main(String[] args) {
        hammingDistance(93,73);
    }

    public static int hammingDistance(int x, int y) {
        int res = 0;
        StringBuilder xx = new StringBuilder(Integer.toBinaryString(x));
        StringBuilder yy = new StringBuilder(Integer.toBinaryString(y));
        int lx = xx.length();
        int ly = yy.length();
        if (x>=y){
            for (int i = 0; i < lx-ly; i++) {
                yy.insert(0, "0");
            }
            char[] xxx = xx.toString().toCharArray();
            char[] yyy = yy.toString().toCharArray();
            //System.out.println(xx+"-"+yy);
            for (int i = 0; i < xxx.length; i++) {
                if (xxx[i] != yyy[i]){
                    res++;
                }
            }
            return res;
        }else if (y>x){
            for (int i = 0; i < ly-lx; i++) {
                xx.insert(0, "0");
            }
            char[] xxx = xx.toString().toCharArray();
            char[] yyy = yy.toString().toCharArray();
            //System.out.println(xx+"-"+yy);
            for (int i = 0; i < yyy.length; i++) {
                if (xxx[i] != yyy[i]){
                    res++;
                }
            }
            return res;
        }else {
            return 0;
        }
    }

}
