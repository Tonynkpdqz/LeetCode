package com.nkpdqz.junior.String;

import java.util.HashMap;
import java.util.Map;

public class _03 {
    public static void main(String[] args) {
        String s = "dddccdbba";
        int i = firstUniqChar(s);
        /*String s1 = s.substring(0, 2);
        String s2 = s.substring(2, s.length());
        System.out.println(s1+"_"+s2);*/
        System.out.println(i);
    }

    public  static int firstUniqChar(String s) {
        if (s.length() == 1){
            return 0;
        }
        Map<String,Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            String ss = String.valueOf(chars[i]);
            map.put(ss,0);
        }
        for (int i = 0; i < chars.length; i++) {
            String ss = String.valueOf(chars[i]);
            Integer integer = map.get(ss);
            map.put(ss,integer+1);
        }
        for (int i = 0; i <chars.length ; i++) {
            String ss = String.valueOf(chars[i]);
            if (map.get(ss) == 1){
                return i;
            }
        }
        return -1;
    }
}
