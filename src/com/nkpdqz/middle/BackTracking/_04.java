package com.nkpdqz.middle.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class _04 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length==0){
            return list;
        }
        backTrack(list,new ArrayList<Integer>(),nums,0);
        return list;
    }

    private void backTrack(List<List<Integer>> list, ArrayList<Integer> integers, int[] nums, int begin) {
        list.add(new ArrayList<Integer>(integers));
        for (int i = begin; i < nums.length; i++) {
            integers.add(nums[i]);
            backTrack(list,integers,nums,i+1);
            integers.remove(integers.size()-1);
        }
    }
}
