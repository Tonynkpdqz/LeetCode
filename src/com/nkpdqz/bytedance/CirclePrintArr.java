package com.nkpdqz.bytedance;

import java.util.ArrayList;

public class CirclePrintArr {
    public ArrayList<Integer> printMartix(int [][] arr){
        ArrayList<Integer> res = new ArrayList<>();
        if (arr.length == 0)
            return res;
        int row = arr.length;
        int lie = arr[0].length;
        int circles = (Math.min(row,lie)-1)/2 +1;
        /*for (int i = 0; i < circles; i++) {
            for (int j = 0; j < ; j++) {
                
            }
            for (int j = 0; j < ; j++) {
                
            }
            for (int j = 0; j < ; j++) {
                
            }
            for (int j = 0; j < ; j++) {
                
            }
        }*/
        return res;
    }



}
