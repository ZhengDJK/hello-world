package com.zheng.math;

import java.util.List;

/**
 * Created by DJ on 2016/9/19.
 * @author DJ
 * @version 1.0-SNAPSHOT
 */
public abstract class Sort<T extends Comparable> {
    /**
     * 成员变量，排序数组
     */
    private List<T> array;

    /**
     * 构造函数
     * @param array 该参数指定一个要排序的List
     */
    public Sort(List<T> array){
        this.setArray(array);
    }

    /**
     * 交换List中的第i跟第j个元素的位置
     * @param i List中要交换的第i个元素位置i
     * @param j List中要交换的第j个元素位置j
     */
    protected void exchange(int i,int j){
        T temp=getArray().get(i);
        getArray().set(i,getArray().get(j));
        getArray().set(j,temp);
    }

    /**
     * 排序函数
     * @return 返回以排序的List
     */
    public abstract List<T> sort();

    /**
     * 获取array
     * @return 返回array
     */
    public List<T> getArray() {
        return array;
    }

    /**
     * 设置array
     * @param array List类型
     */
    public void setArray(List<T> array) {
        this.array = array;
    }
}
