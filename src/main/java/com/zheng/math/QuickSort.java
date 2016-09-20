package com.zheng.math;

import java.util.List;

/**
 * Created by DJ on 2016/9/19.
 * 快速排序实现
 */
public class QuickSort<T extends Comparable> extends Sort<T> {
    public QuickSort(List<T> array) {
        super(array);
    }

    @Override
    public List<T> sort() {
        quackSort(0,getArray().size()-1);
        return getArray();
    }

    private void quackSort(int p,int r){
        if(p<r){
            int q=partition(p,r);
            quackSort(p,q-1);
            quackSort(q+1,r);
        }
    }

    private int partition(int p,int r){
        List<T> arr=getArray();
        T x=arr.get(r);
        int i=p-1;
        for(int j=p;j<r;j++){
            if(arr.get(j).compareTo(x)<=0){
                i++;
                exchange(i,j);
            }
        }
        exchange(i+1,r);
        return i+1;
    }
}
