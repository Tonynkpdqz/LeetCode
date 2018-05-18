package com.nkpdqz.junior.SortAndSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m==0&&n==0){
            return;
        }else if (m==0){
            nums1 = Arrays.copyOf(nums2,n);
            return;
        }else if (n==0){
            return;
        }
        int j=0;
        for (int i = 0; i < m+n; i++) {
            if (nums1[i]>nums2[j] || nums1[i] == 0){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                if (nums2[j] == 0){
                    j++;
                }
                if (j == n)
                    return;
            }
        }
    }
}
