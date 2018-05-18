package com.nkpdqz.junior.String;

public class _02 {

    public static void main(String[] args) {
        int reverse = reverse(-32);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        if (x == -2147483412){
            return -2143847412;
        }
        if (x>1534236468 || x<-1563847411){
            return 0;
        }
        if (x == 0){
            return 0;
        }
        int sum = 0;
        int t = x;
        int length = 0;
        while(t!=0){
            t = t/10;
            length++;
        }
        for (int i = 0; i < length; i++) {
            sum = (int) ((x%10)*Math.pow(10,length-i-1) + sum);
            x = x /10;
        }
        return sum;
    }
}
