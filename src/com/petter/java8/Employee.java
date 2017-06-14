package com.petter.java8;

/**
 * @author hongxf
 * @since 2017-06-02 11:01
 */
public class Employee {
    private Integer age;
    private String name;
    private Double salary;
    private Status status;

    public Employee() {
    }

    public Employee(Integer age, String name, Double salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Employee(Integer age, String name, Double salary, Status status) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.status = status;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }

    public enum Status {
        FREE,
        BUSY,
        VOCATION
    }
}
