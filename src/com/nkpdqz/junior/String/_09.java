package com.nkpdqz.junior.String;

import java.util.ArrayList;
import java.util.List;

public class _09 {
    public static void main(String[] args) {
        String[] strs = {"aca","cba"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        for (String s:strs
             ) {
            if (s.isEmpty()){
                return "";
            }
        }
        if (strs.length == 1){
            return strs[0];
        }
        List<char[]> list = new ArrayList<>();
        int size = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length()<size){
                size = strs[i].length();
            }
        }
        System.out.println(size);
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            list.add(chars);
        }
        System.out.println(list.toString());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            System.out.println("i");
            for (int j = 0; j < list.size()-1; j++) {
                System.out.println("j");
                if (list.get(j)[i]  != list.get(j+1)[i]){
                    return stringBuilder.toString();
                }
                if (j == list.size()-2){
                    stringBuilder.append(list.get(j)[i]);
                }
            }
        }
        return stringBuilder.toString();
    }
}
