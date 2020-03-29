package com.nkpdqz.bytedance;

public class LongestCommonBefore {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        StringBuilder res = new StringBuilder();
        int length = strs[0].length();
        for (String s:strs
             ) {
            if(s.length()<length)
                length = s.length();
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < strs.length-1; j++) {
                if (strs[j].charAt(i) == strs[j+1].charAt(i)) {
                    if (j+1 == strs.length-1)
                        res.append(strs[j].charAt(i));
                }
                else
                    return res.toString();
            }
        }
        return res.toString();
    }

    public String Nicer0(String[] strs){
        if (strs == null || strs.length == 0)
            return "";
        return longestCommonPrefix(strs,0,strs.length-1);
    }

    public String longestCommonPrefix(String[] strs,int left,int right){
        if (left == right){
            return strs[left];
        }
        int mid = (left+right)/2;
        String l = longestCommonPrefix(strs,left,mid);
        String r = longestCommonPrefix(strs,mid+1,right);
        return combine(l,r);
    }

    private String combine(String l, String r) {
        int length = Math.min(l.length(),r.length());
        for (int i = 0; i < length; i++) {
            if (l.charAt(i) != r.charAt(i))
                return l.substring(0,i);
        }
        return l;
    }


}
