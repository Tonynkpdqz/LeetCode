package com.nkpdqz.middle.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class _03 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums==null||nums.length==0)
            return res;
        backTeacking(new ArrayList<Integer>(),nums,res);
        return res;
    }

    private void backTeacking(ArrayList<Integer> integers, int[] nums, List<List<Integer>> res) {
        if (integers.size()==nums.length) {
            res.add(integers);
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (integers.contains(nums[i]))
                    continue;
                integers.add(nums[i]);
                backTeacking(integers,nums,res);
                integers.remove(integers.size()-1);
            }
        }

    }

}
