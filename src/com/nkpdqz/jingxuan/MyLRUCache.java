package com.nkpdqz.jingxuan;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class MyLRUCache {

    private int length;
    private Map<Integer,MyEntry<Integer,Boolean>> map = new HashMap<>();
    public MyLRUCache(int capacity) {
        length = capacity;
    }

    public int get(int key) {
        if (null == map.get(key))
            return -1;
        else {
            map.get(key).setIsUsed(true);
            return map.get(key).getNumber();
        }
    }

    public void put(int key,int value){
        int size = map.size();
        if (size>=length){
        }else {
            map.put(key, new MyEntry<>(value, false));
        }
    }
}
