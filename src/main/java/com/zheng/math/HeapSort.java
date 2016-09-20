package com.zheng.math;

import java.util.List;

/**
 * Created by DJ on 2016/9/19.
 */
public class HeapSort<T extends Comparable> extends Sort<T> {
    public HeapSort(List<T> array) {
        super(array);
    }

    @Override
    public List<T> sort() {
        buildMaxHeap();
        for(T i:getArray())
            System.out.print(i+" ");
        for(int i=getArray().size()-1;i>0;i--){
            exchange(0,i);
            maxHeapify(0,i);
        }
        return getArray();
    }

    private int parent(int i){
        return (i-1)/2;
    }

    private int left(int i){
        return 2*i+1;
    }
    private int right(int i){
        return 2*i+2;
    }

    private void maxHeapify(int i,int size){
        int l=left(i);
        int r=right(i);
        List<T> arr=this.getArray();
        int largest;
        if(l<size && arr.get(l).compareTo(arr.get(i))>0)
            largest=l;
        else
            largest=i;
        if(r<size && arr.get(r).compareTo(arr.get(largest))>0)
            largest=r;
        if(largest!=i){
            exchange(i,largest);
            maxHeapify(largest,size);
        }
    }

    private void buildMaxHeap(){
        int size=getArray().size();
        for(int i=size/2-1;i>=0;i--){
            maxHeapify(i,size);
        }
    }
}
