package com.petter.java8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author hongxf
 * @since 2017-06-02 18:00
 */
public class TestStreamAPI3 {
    private List<Employee> employees = Arrays.asList(
            new Employee(20, "ww", 3000.0, Employee.Status.BUSY),
            new Employee(30, "wc", 4400.0, Employee.Status.FREE),
            new Employee(30, "hongxf", 3030.0, Employee.Status.VOCATION)
    );

    public void test1() {
        boolean b = employees.stream()
                .allMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b);

        boolean b1 = employees.stream()
                .anyMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);

        boolean b2 = employees.stream()
                .noneMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);

        Optional<Employee> optional = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .findFirst();
        System.out.println(optional.get());

        Optional<Employee> any = employees.stream()
                .filter((e) -> e.getStatus().equals(Employee.Status.FREE))
                .findAny();
        System.out.println(any.get());
    }

    public void test2() {
        long count = employees.stream()
                .count();
        System.out.println(count);

        Optional<Employee> max = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(max.get());

        Optional<Double> min = employees.stream()
                .map(Employee::getSalary)
                .min(Double::compare);
        System.out.println(min.get());
    }

    public void test3() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);

        System.out.println("----------------------");
        Optional<Double> optional = employees.stream()
                .map(Employee::getSalary)
                .reduce(Double::sum);
        System.out.println(optional.get());

    }

    public void test4() {
        List<String> list = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("---------------------");
        Set<String> set = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("---------------------");

        HashSet<String> hashSet = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));
        hashSet.forEach(System.out::println);
    }

    public void test5() {
        //总数
        Long count = employees.stream()
                .collect(Collectors.counting());
        System.out.println(count);
        System.out.println("-----------------");
        //平均值
        Double avg = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);
        System.out.println("-----------------");
        //总和
        Double sum = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sum);
        System.out.println("------------------");
        //最大值
        Optional<Employee> optional = employees.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(optional.get());
        System.out.println("------------------");
        //最小值
        Optional<Double> optional1 = employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.minBy(Double::compare));
        System.out.println(optional1.get());
    }

    public void test6() {
        String collect = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }

    public static void main(String[] args) {
        TestStreamAPI3 testStreamAPI3 = new TestStreamAPI3();
        testStreamAPI3.test6();
    }
}
