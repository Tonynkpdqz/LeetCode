package com.nkpdqz.middle.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class _02 {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backTeacking("",res,n,n);
        return res;
    }

    private void backTeacking(String s, List<String> res, int left, int right) {
        if (left>right)
            return;
        if (left>0)
            backTeacking(s+"(",res,left-1,right);
        if (right>0)
            backTeacking(s+")",res,left,right-1);
        if (left==0&&right==0){
            res.add(s);
            return;
        }
    }

}
