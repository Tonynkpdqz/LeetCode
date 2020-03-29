package com.nkpdqz.bytedance;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class NoRepeateCharLongestChildString {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        char[] chars = s.toCharArray();
        int sum = 1;
        int max = 1;
        LinkedList<Character> list = new LinkedList<>();
        list.offer(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (list.contains(chars[i])){
                int leng = list.indexOf(chars[i]);
                for (int j = 0; j <= leng; j++) {
                    list.poll();
                    sum--;
                }
                list.offer(chars[i]);
                sum++;
                if (sum>max){
                    max = sum;
                }
            }else {
                list.offer(chars[i]);
                sum++;
                if (sum>max){
                    max = sum;
                }
            }
        }
        return max;
    }

    private int nicer(String s){
        int i = 0;int j = 0;
        int len = s.length();
        int ans = 0;
        Map<Character,Integer> map = new HashMap<>();
        for (;j<len;j++) {
            if(map.containsKey(s.charAt(j))){
                Integer ii = map.get(s.charAt(j));
                i = Math.max(ii,i);
            }
            ans = Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }

}
