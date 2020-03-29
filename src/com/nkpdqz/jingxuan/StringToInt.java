package com.nkpdqz.jingxuan;

public class StringToInt {

    public int StrToInt(String str) {

        if (str == null || str.trim().equals("")){
            return 0;
        }
        char[] chars = str.toCharArray();
        int sum = 0;
        if (chars[0] == '+'){
            for (int i = chars.length-1; i >= 1; i--) {
                if (chars[i] < 48 || chars[i]> 57)
                    return 0;
                else {
                    int thisNum = chars[i]-'0';
                    double pow = Math.pow(10, chars.length - i - 1);
                    sum = (int) (sum + thisNum*pow);
                }
            }
            return sum;
        }else if (chars[0] == '-'){
            for (int i = chars.length-1; i >= 1; i--) {
                if (chars[i] < 48 || chars[i]> 57)
                    return 0;
                else {
                    int thisNum = chars[i]-'0';
                    double pow = Math.pow(10, chars.length - i - 1);
                    System.out.print(thisNum+"  "+pow+"  ");
                    sum = (int) (sum + thisNum*pow);
                    System.out.println(sum);
                }
            }
            sum = -sum;
            System.out.println(sum);
            return sum;
        }else if (chars[0] >=48 && chars[0]<=57){
            for (int i = chars.length-1; i >= 0; i--) {
                if (chars[i] < 48 || chars[i]> 57)
                    return 0;
                else {
                    int thisNum = chars[i]-'0';
                    double pow = Math.pow(10, chars.length - i - 1);
                    sum = (int) (sum + thisNum*pow);
                }
            }
            return sum;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        StringToInt stringToInt = new StringToInt();
        System.out.println(stringToInt.StrToInt("-2147483648"));
    }

}
