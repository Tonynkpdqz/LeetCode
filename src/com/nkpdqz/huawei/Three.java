package com.nkpdqz.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Three {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.nextInt());
        }
        int sqrt = (int) Math.sqrt(list.size());
        int[][] mat= new int[sqrt][sqrt];
        System.out.println(sqrt);
        int beat = 0;
        for (int i = 0; i < sqrt; i++) {
            for (int j = 0; j < sqrt; j++) {
                mat[i][j] = list.get(i*sqrt+j);
                if (mat[i][j] != 1 && mat[i][j]!=0)
                    beat++;
                System.out.println(mat[i][j]);
            }
        }
        int length = getLength(mat, 0, 0, 0, beat);
        System.out.println(length);

    }

    public static int getLength(int[][] mat,int i,int j,int start,int beat){
        if (i > mat.length - 1 || j > mat[0].length - 1 || mat[i][j] == 0)
            return -1;
        if (start == beat)
            return 0;
        if (mat[i+1][j]==1){
            mat[i+1][j]=0;
            return getLength(mat,i+1,j,start,beat);
        }
        if (mat[i][j+1]==1){
            return getLength(mat,i,j+1,start,beat);
        }
        if (mat[i-1][j]==1){
            return getLength(mat,i-1,j,start,beat);
        }
        if (mat[i][j-1]==1){
            return getLength(mat,i,j-1,start,beat);
        }

        if (mat[i+1][j]==start+1){
            start++;
            return 1+getLength(mat,i+1,j,start,beat);
        }
        if (mat[i][j+1]==start+1){
            start++;
            return 1+getLength(mat,i,j+1,start,beat);
        }
        if (mat[i-1][j]==start+1){
            start++;
            return 1+getLength(mat,i-1,j,start,beat);
        }
        if (mat[i][j-1]==start+1){
            start++;
            return 1+getLength(mat,i,j-1,start,beat);
        }
        return -1;
    }
}
