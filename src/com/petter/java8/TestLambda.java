package com.petter.java8;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author hongxf
 * @since 2017-06-01 16:18
 */
public class TestLambda {

    //原来的匿名内部类
    public void test1() {
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(com);
    }

    //采用Lambda表达式
    public void test2() {
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        TreeSet<Integer> treeSet = new TreeSet<>(com);
    }
}
