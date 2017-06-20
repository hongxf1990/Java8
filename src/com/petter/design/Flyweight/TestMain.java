package com.petter.design.Flyweight;

/**
 * @author hongxf
 * @since 2017-06-20 10:51
 */
public class TestMain {
    public static void main(String[] args) {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        Flyweight flyweight = factory.getFlyweight("a");
        flyweight.setIntrinsicState("aaaa");
        flyweight.operation("ccc");

        Flyweight flyweight2 = factory.getFlyweight("a");
        flyweight2.operation("bbb");

        System.out.println(flyweight == flyweight2);

        Flyweight flyweight3 = new UnSharedConcreteFlyweight();
        flyweight3.setIntrinsicState("ddd");
        flyweight3.operation("eeee");
    }
}
