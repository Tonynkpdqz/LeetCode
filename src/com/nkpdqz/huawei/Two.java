package com.nkpdqz.huawei;

import java.util.LinkedList;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        sc.nextLine();
        int res = 0;
        int max = 0;
        for (int i = 0; i < strs.length; i++) {
            strs[i] = sc.nextLine();
        }
        char[][] mat = new char[strs.length][strs[0].length()];
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[0].length(); j++) {
                mat[i][j] = strs[i].charAt(j);
            }
        }
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[0].length(); j++) {
                if (mat[i][j] == '1'){
                    res = find(mat, i, j);
                    if (max<res)
                        max = res;
                }
            }
        }
        System.out.println(max);
    }

    public static int find(char[][] mat,int row,int len) {
        int sum = 1;
        while (true) {
            int x = row + sum;
            int y = len + sum;
            if (x >= mat.length || y >= mat[0].length) {
                return sum * sum;
            }
            for (int i = row; i <= x; i++) {
                if (mat[i][y] != '1') {
                    return sum * sum;
                }
                continue;
            }
            for (int i = len; i <= y; i++) {
                if (mat[x][i] != '1') {
                    return sum * sum;
                }
                continue;
            }
            ++sum;
        }
    }
}
