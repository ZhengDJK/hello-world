package com.zheng.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DJ on 2016/9/19.
 */
public class Test {
    public static void main(String[] args){
        List<Integer> arr=new ArrayList<Integer>();
        arr.add(2);arr.add(3);arr.add(1);
        arr.add(-2);arr.add(-3);arr.add(-1);
        System.out.println();
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        Sort<Integer> sort=new QuickSort<Integer>(arr);
        sort.sort();
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();

    }
}
