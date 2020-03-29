package com.nkpdqz.jingxuan;

import java.util.LinkedList;

public class HalfSearch {

    public static void main(String[] args) {
        int [] a = {1,2,3,5,6,7,9,11,22,23};
        HalfSearch hf = new HalfSearch();
        int num = hf.getNum(a, 22);
        System.out.println(num);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("asd");

    }

    public int getNum(int[] nums,int num){
        int start = 0;
        int end = nums.length-1;
        while (end>=start){
            if (nums[(end+start)/2]>num){
                end = (end-start)/2-1;
            }else if (nums[(end+start)/2]<num){
                start = (end+start)/2+1;
            }else {
                return (end+start)/2;
            }
        }
        return -1;
    }
}
