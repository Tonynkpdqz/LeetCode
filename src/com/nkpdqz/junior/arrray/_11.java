package com.nkpdqz.junior.arrray;

public class _11 {

    public static void main(String[] args) {

    }

    public static void rotate(int[][] matrix) {
        int t = 0;
        int len = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length-i-1; j++) {
                t = matrix[i][j];
                matrix[i][j] = matrix[len-j-1][len-i-1];
                matrix[len-j-1][len-i-1] = t;
            }
        }

        for(int i=0;i<len/2;++i){
            for(int j=0;j<len;++j){
                t=matrix[i][j];
                matrix[i][j]=matrix[len-i-1][j];
                matrix[len-i-1][j]=t;
            }
        }

    }
}
