package com.nkpdqz.middle.BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _01 {

    String[] dict = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits==null||digits.length()==0)
            return res;
        backTeacking(new StringBuilder(),digits,0,res);
        return res;
    }

    private void backTeacking(StringBuilder stringBuilder, String digits, int index, List<String> res) {
        if (stringBuilder.length()==digits.length()){
            res.add(stringBuilder.toString());
            return;
        }
        for (int i = 0; i < dict[digits.charAt(index)-'0'].length(); i++) {
            stringBuilder.append(dict[digits.charAt(index)-'0'].charAt(i));
            backTeacking(stringBuilder,digits,index+1,res);
            if (stringBuilder.length()>0)
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}
