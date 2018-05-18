package com.nkpdqz.junior.Others;

import java.util.ArrayList;
import java.util.List;

public class _04 {

    public List<List<Integer>> generate(int numRows) {
        List< List<Integer> > triangle = new ArrayList< List<Integer> >();
        if(numRows==0)return triangle;

        List<Integer> tmp1=new ArrayList<Integer>();
        tmp1.add(1);
        triangle.add(tmp1);
        for(int i=1;i<numRows;i++){
            List<Integer> last=triangle.get(i-1);
            List<Integer> tmp=new ArrayList<Integer>();
            tmp.add(1);
            for(int j=1;j<i;j++){
                tmp.add( last.get(j-1)+last.get(j) );
            }
            tmp.add(1);
            triangle.add(tmp);
        }
        return triangle;
    }

}
