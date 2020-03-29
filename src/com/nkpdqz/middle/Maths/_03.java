package com.nkpdqz.middle.Maths;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class _03 {

    final static Integer maxCharNum = 26;

    static HashMap<Character,Integer> map = new HashMap<>();

    static {
        for (int i = 0; i < maxCharNum; i++) {
            map.put((char) ('A'+i),i+1);
        }
    }

    public int titleToNumber(String s) {
        final AtomicInteger length = new AtomicInteger(s.length()-1);
        AtomicInteger res = new AtomicInteger(0);
        s.chars().forEach(c->{
            res.set((int) (res.intValue()+map.get((char)c)+Math.pow(maxCharNum,length.get())));
            length.set(length.get()-1);
        });
        return res.get();
    }

    public static int titleToNumber2(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            res= res *26+(s.charAt(i)-'A'+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int aab = titleToNumber2("AAB");
        System.out.println(aab);
    }
}
