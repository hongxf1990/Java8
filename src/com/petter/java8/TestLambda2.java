package com.petter.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author hongxf
 * @since 2017-06-02 10:31
 */
public class TestLambda2 {

    public void test() {
        Consumer<String> con = (x) -> System.out.println(x);
        Consumer<String> con2 = System.out::println;

        Employee employee = new Employee();
        Supplier<String> supplier = () -> employee.getName();
        Supplier<String> supplier2 = employee::getName;

        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> comparator2 = Integer::compare;

        BiPredicate<String, String> biPredicate = (x, y) -> x.equals(y);
        BiPredicate<String, String> biPredicate2 = String::equals;

        Supplier<Employee> sup = () -> new Employee();
        //构造器引用方式（根据函数接口的方法类型匹配相应的构造器）
        Supplier<Employee> sup2 = Employee::new;

        Function<Integer, String[]> function = (x) -> new String[x];
        String[] strs = function.apply(10);
        System.out.println(strs.length);

        Function<Integer, String[]> function2 = String[]::new;
        String[] strs2 = function2.apply(20);
        System.out.println(strs2.length);
    }

    private List<Employee> employees = Arrays.asList(
       new Employee(20, "ww", 3000.0),
       new Employee(30, "wc", 4400.0),
       new Employee(30, "hongxf", 3030.0)
    );

    public void test2() {
        Collections.sort(employees, (x, y) -> {
            if (x.getAge().equals(y.getAge())) {
                return x.getName().compareTo(y.getName());
            }
            return x.getAge().compareTo(y.getAge());
        });
        System.out.println(employees);
    }

    public static void main(String[] args) {
        TestLambda2 testLambda2 = new TestLambda2();
        testLambda2.test2();
    }
}
