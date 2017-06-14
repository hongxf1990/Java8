package com.petter.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author hongxf
 * @since 2017-06-02 16:03
 */
public class TestStreamAPI2 {

    private List<Employee> employees = Arrays.asList(
            new Employee(20, "ww", 3000.0),
            new Employee(30, "wc", 4400.0),
            new Employee(30, "hongxf", 3030.0)
    );

    public void test4() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
        Stream<Stream<Character>> streamStream = list.stream()
                .map(TestStreamAPI2::filterCharacter); //{{a, a, a},{b, b, b}...}
        streamStream.forEach(System.out::println);

        System.out.println("--------------------------------");
        list.stream()
                .flatMap(TestStreamAPI2::filterCharacter) //{a, a, a, b, b, b...}
                .forEach(System.out::println);
    }

    public static Stream<Character> filterCharacter(String str) {
        List<Character> list = new ArrayList<>();
        for (Character c : str.toCharArray()) {
            list.add(c);
        }
        return list.stream();
    }

    public void test3() {
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("----------------------------------");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public void test2() {
        employees.stream()
                .filter((e) -> {
                    System.out.println("短路，找够符合条件的数据，后面迭代不再进行");
                    return e.getAge() > 20;
                })
                .limit(1)
                .forEach(System.out::println);
    }

    public void test1() {
        //中间操作
        Stream<Employee> stream = employees.stream()
                .filter((employee) -> {
                    System.out.println("中间操作");
                    return employee.getAge() > 20;
                });
        //终止操作
        stream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        TestStreamAPI2 testStreamAPI2 = new TestStreamAPI2();
        testStreamAPI2.test4();
    }
}
