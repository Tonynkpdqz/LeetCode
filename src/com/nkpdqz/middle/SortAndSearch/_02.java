package com.nkpdqz.middle.SortAndSearch;

import java.util.*;

public class _02 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>(k);
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[i-1])
                list.add(nums[i]);
        }
        return list;
    }
}
