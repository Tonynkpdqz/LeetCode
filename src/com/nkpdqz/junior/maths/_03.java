package com.nkpdqz.junior.maths;

import org.junit.Test;

public class _03 {

    public boolean isPowerOfThree(int n) {
        if (n == 1){
            return true;
        }
        if (n<3){
            return false;
        }
        while (n!=1){
            if (n%3 == 0){
                n = n/3;
            }
            else
                return false;
        }
        return true;
    }
}
