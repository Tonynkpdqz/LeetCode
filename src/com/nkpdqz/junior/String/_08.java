package com.nkpdqz.junior.String;

public class _08 {
    public static void main(String[] args) {
        String s = countAndSay(6);
        System.out.println(s);
    }

    public static String countAndSay(int n) {
        if (n <= 0) return "-1";

        String result = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder builder = new StringBuilder();
            int index = 0;
            while (index < result.length()) {
                // 记录值
                char val = result.charAt(index);
                // 记录连续位数
                int count = 0;

                // 查找连续位数，碰到不相同的数字时停止。
                while (index < result.length() && result.charAt(index) == val) {
                    index++;
                    count++;
                }

                // 追加连续位数到结果中
                builder.append(String.valueOf(count));
                // 追加连续位数的值到结果中
                builder.append(val);
            }
            System.out.println(builder.toString());
            result = builder.toString();
        }
        return result;
    }
}
