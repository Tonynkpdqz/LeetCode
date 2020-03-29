package com.nkpdqz.jingxuan;

import java.util.HashMap;
import java.util.Map;

public class HalfNumberFindOne {

    public static void main(String[] args) {
        HalfNumberFindOne test = new HalfNumberFindOne();
        int i = test.MoreThanHalfNum_Solution(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2});
        System.out.println(i);
    }

    public int MoreThanHalfNum_Solution(int [] array) {
        /*int low = 0;
        int high = array.length-1;
        int key = (low+high)/2;
        int pos = 0;
        while(key!=pos){
            if(pos>key){
                pos = portition(array,low,pos-1);
            }else if(pos<key){
                pos = portition(array,pos+1,high);
            }
        }
        return array[key];*/
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(!map.containsKey(array[i])){
                map.put(array[i],1);
            }else{
                map.put(array[i],map.get(array[i])+1);
            }
        }
        System.out.println(map.get(2));
        int sum = 0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(sum<e.getValue())
                sum = e.getValue();
        }
        if(sum<=array.length/2){
            return 0;
        }else{
            return sum;
        }
    }

    public int portition(int [] arr,int low,int high){
        int key = arr[low];
        while(low<high){
            while(low<high&&arr[high]>=key){
                high--;
            }
            arr[low] = arr[high];
            while(low<high&&arr[low]<=key){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = key;
        return low;
    }
}
