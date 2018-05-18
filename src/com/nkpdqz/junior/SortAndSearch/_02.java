package com.nkpdqz.junior.SortAndSearch;

public class _02 {

    public int firstBadVersion(int n) {
        int res = -1;
        int low = 1;
        int high = n;
        while (low<=high){
            int mid = low + (high - low) / 2;
            if (IsbadVersion(mid)){
                res = mid;
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return res;
    }

    private boolean IsbadVersion(int mid) {
        return true;
    }
}
