package com.nkpdqz.middle.SortAndSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _06 {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        if (intervals.size()<1){
            return res;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        Interval temp = null;
        for (Interval interval:intervals) {
            if (temp==null||temp.end<interval.start){
                res.add(interval);
                temp=interval;
            }else {
                temp.end=Math.max(temp.end,interval.end);
            }
        }
        return res;
    }
}
