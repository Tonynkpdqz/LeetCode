package com.nkpdqz.middle.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class _04 {

    public int lengthOfLongestSubstring(String s) {
        if (Objects.equals(s, ""))
            return 0;
        char[] chars = s.toCharArray();
        int[] sum = new int[s.length()];
        for (int i = 0; i < s.length()-1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(chars[i]);
            for (int j = i+1; j < s.length(); j++) {
                if (!stringBuilder.toString().contains(String.valueOf(chars[j]))){
                    stringBuilder.append(chars[j]);
                    continue;
                }
                sum[i] = stringBuilder.toString().length();
                break;
            }
        }
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (sum[i]>res)
                res = sum[i];
        }
        return res;
    }
    public int nicer(String s){
        if (s.length()==0)
            return 0;
        int max=1,i=0,j=1;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put(s.charAt(0),0);
        while (j<s.length()){
            if (map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>=i){
                i = map.get(s.charAt(j))+1;
            }
            map.put(s.charAt(j),j);
            if (j-i+1>max)
                max = j-i+1;
            ++j;
        }
        return max;
    }

}
