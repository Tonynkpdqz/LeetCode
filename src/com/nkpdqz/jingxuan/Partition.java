package com.nkpdqz.jingxuan;

public class Partition {

    public int partition(int[] arr,int low,int high){
        int key = arr[low];
        while(low<high){
            while(low<high && arr[high]>=key){
                high--;
            }
            arr[low] = arr[high];
            while(low<high&& arr[low]<=key){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[high] = key;
        return high;
    }
}
