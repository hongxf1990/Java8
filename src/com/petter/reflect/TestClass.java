package com.petter.reflect;

/**
 * @author hongxf
 * @since 2017-09-20 9:55
 */
public class TestClass {

    private Long id;
    public String name;

    public TestClass() {
    }

    public TestClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
