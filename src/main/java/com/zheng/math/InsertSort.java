package com.zheng.math;

import java.util.List;

/**
 * Created by DJ on 2016/9/19.
 */
public class InsertSort<T extends Comparable> extends Sort<T> {
    public InsertSort(List<T> array) {
        super(array);
    }

    public List<T> sort() {
        List<T> array=this.getArray();
        for(int i=1;i<array.size();i++){
            T key=array.get(i);
            int j=i-1;
            while (j>=0 && array.get(j).compareTo(key)>0){
                array.set(j+1,array.get(j));
                j--;
            }
            array.set(j+1,key);
        }
        return array;
    }
}
